package rendering;

import de.matthiasmann.twl.utils.PNGDecoder;
import org.lwjgl.opengl.GL40;
import utility.Debug;
import utility.main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Hashtable;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL40.*;

/**
 * <h1>Abstract rendering utilities</h1>
 * <br>
 * <p>
 * Base of all renderer classes, and home to core render functions.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public abstract class Renderer {

    /**
     * <h2>Blank renderer implementation</h2>
     * Used for utility, not rendering.
     */
     public static Renderer RenderHelper = new Renderer(){
        @Override
        public void renderFrame() { }
     };

    /**
     * <h2>Size in pixels of the tiles when displayed on screen</h2>
     */
    public static int TILE_WIDTH = 128, TILE_HEIGHT = TILE_WIDTH / 2, TILE_HALF_HEIGHT = TILE_HEIGHT / 2, TILE_HALF_WIDTH = TILE_WIDTH / 2, TILE_QUARTER_HEIGHT = TILE_HALF_HEIGHT / 2, TILE_QUARTER_WIDTH = TILE_HALF_WIDTH / 2;

    @Deprecated
    public static void reCalcTile(){
        TILE_WIDTH = 64 + Debug.debugValue;
        TILE_HEIGHT = TILE_WIDTH / 2;
        TILE_HALF_HEIGHT = TILE_HEIGHT / 2;
        TILE_HALF_WIDTH = TILE_WIDTH / 2;
        TILE_QUARTER_HEIGHT = TILE_HALF_HEIGHT / 2;
        TILE_QUARTER_WIDTH = TILE_HALF_WIDTH / 2;
    }


    /**
     * <h2>High in pixels, of the screen edge UI elements.</h2>
     */
    public static final int BASE_HEIGHT = 250, TOP_HEIGHT = 45;

    /**
     * <h2>How much the gameview is vertically reduced, due to the UI topbar and base.</h2>
     * {@link Renderer#BASE_HEIGHT} + {@link Renderer#TOP_HEIGHT}
     */
    public static final int GAMEVIEW_HEIGHT_REDUCTION = BASE_HEIGHT + TOP_HEIGHT;

    /**
     * <h2>Global store of ID's all textures loaded</h2>
     * Maps gl texture ID's to the texture name path
     */
    public static final Hashtable<Integer, String> textures = new Hashtable<>();

    /**
     * <h2>Has the graphics library been configured ready for use?</h2>
     */
    public static boolean renderInitalised = false;

    /**
     * <h2>The position of this renderer on the z axis</h2>
     * @see Window#addRenderer(Renderer)
     */
    private float StackPosition = 0f;

    /**
     * <h2>First time rendering set-up</h2>
     * when making the first window, before any windows are created.
     * Configures glfw, and rendering hints.
     */
    public static void preInit() {
        if (glfwInit() || renderInitalised) return;
        if ( !glfwInit() )                                                                                               // Initialize GLFW. Most GLFW functions will not work before doing this.
            throw new IllegalStateException("Unable to initialize GLFW");

        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);                                                                       // the window will stay hidden after creation

        // TODO this can be used to load rendering preferences / settings
        renderInitalised = true;
    }

    /**
     * <h2>Handles render initalisation which requires a render context</h2>
     * Called after a window has been created for the first time. Uses the context of that first window
     * to create textures.
     */
    public static void postInit() {
        if (renderInitalised) return;

        main.window.addRenderer(new StackTestRenderer());
        glEnable      (GL_TEXTURE_2D);                                                                                  // Enable 2d texture rendering
        //glEnable      (GL_COLOR_MATERIAL);
        glEnable      (GL_BLEND);
        glMatrixMode  (GL_TEXTURE);
        glScalef(-1,1,1);                                                       // Textures are inverted horrizontally, this scale tells gl to invert quads again so they render correctly.
        glTileBlendMode();
        renderInitalised = true;
    }

    /**
     * <h2>Renders a quad to context with the provided texture.</h2>
     * @param texture The gl texture ID to render
     * @param x x position
     * @param y y position
     */
    public void renderQuad(int texture, float x, float y) {
        renderQuad(texture, x, y, StackPosition, Renderer.TILE_WIDTH, Renderer.TILE_HEIGHT);
    }

    /**
     * <h2>Renders a quad to context with the provided texture.</h2>
     * @param texture The gl texture ID to render
     * @param x x position
     * @param y y position
     * @param w Quad width
     * @param h Quad height
     */
    public void renderQuad(int texture, float x, float y, float w, float h) {
        renderQuad(texture,x,y,StackPosition,w,h);
    }

    private void renderQuad(int texture, float x, float y, float z, float w, float h) {
        glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_REPLACE);                                                       // I have no idea what this does, but it's magic. Without it, quad textures appear blueish and dark.
        glPushMatrix();

        glTranslatef(x, y, z);                                                                                          // Move to position to draw TODO is this needed?
        // set the color of the quad (R,G,B,A)

        GL40.glColor4f(0,0,0,0);
        glBindTexture(GL_TEXTURE_2D, texture);                                                                          // select 2d texture to use by id
        glBegin(GL_QUADS);                                                                                              // Notify we're drawing quad co-oords
                glTexCoord3f(1.0f, 1.0f,z);    glVertex3f(x, y, z);                                                // Plot all four corners of the quad
                glTexCoord3f(1.0f, 0.0f,z);    glVertex3f(x, y + h, z);                                        // VERT Co-ord : Placement of the quad's corners
                glTexCoord3f(0.0f, 0.0f,z);    glVertex3f(x + w, y + h, z);                                 // TEX CO-ord : Placement of the texture within the quad. Value is from 0.0 to 1.0,
                glTexCoord3f(0.0f, 1.0f,z);    glVertex3f(x + w, y, z);                                         // representing 0 to 100 percentage of the parent quad.
            glEnd();                                                                                                    // Nofify we've finished drawing quad
        glPopMatrix();
    }

    /**
     * <h2>Loads a png from resources into OpenGL</h2>
     * @param path The image to load, relative to rsc
     * @return the ID of the texture once loaded. This id will be used to refer to it from now on.
     */
    public int importTexture(String path){
        ByteBuffer buf = null;
        int width;
        int height;

        try {
            File file;
            InputStream in = new FileInputStream(path);                                                                 // Open the PNG file as an InputStream
            PNGDecoder decoder = new PNGDecoder(in);                                                                    // Link the PNG decoder to this stream

            width = decoder.getWidth();                                                                                 // Fetch the size. only done once for speed.
            height = decoder.getHeight();

            buf = ByteBuffer.allocateDirect(4 * width * height);                                                        // Decode the PNG file in a ByteBuffer
            decoder.decode(buf, width * 4, PNGDecoder.Format.RGBA);

            buf.flip();                                                                                                 // Clean up
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
            return -1;
        }

        // We no have an buffer of colours, representing the image. Now we just need to save it to video ram via opengl
        int texId = loadBufferedimageToOpenGL(buf, width, height);
        textures.put(texId, path);                                                                                      // Store the id and path, so we know the ID of all images
        return texId;
    }

    /**
     * <h2>Loads a {@link BufferedImage} to OpenGl for use</h2>
     * @param image The image to load
     * @param width Width of the image
     * @param height Height of the image
     * @return the ID of the texture once loaded. This id will be used to refer to it from now on.
     * @throws IOException if the <code>image</code> could not be read by ImageIO
     */
    public static int loadBufferedimageToOpenGL(BufferedImage image, int width, int height) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(image, "png", out);
        return loadBufferedimageToOpenGL(ByteBuffer.wrap(out.toByteArray()), width, height);
    }

    /**
     * <h2>Loads decoded PNG byte data to OpenGL </h2>
     * @param buf the byte buffer to load
     * @param width The height of the image
     * @param height The width of the image
     * @return the ID of the texture once loaded. This id will be used to refer to it from now on.
     */
    public static int loadBufferedimageToOpenGL(ByteBuffer buf, int width, int height){
        int texId = GL40.glGenTextures();                                                                               // Create a new texture object in memory, and get the id of it.
        GL40.glActiveTexture(GL40.GL_TEXTURE0);
        GL40.glBindTexture(GL40.GL_TEXTURE_2D, texId);                                                                  // specify that this texture is 2D

        GL40.glPixelStorei(GL40.GL_UNPACK_ALIGNMENT, 1);                                                         // specify length of color data in buffer, so it's read properly

        GL40.glTexImage2D(GL40.GL_TEXTURE_2D, 0, GL40.GL_RGBA, width, height, 0,                           // Place image buffer into memory
                GL40.GL_RGBA, GL40.GL_UNSIGNED_BYTE, buf);

        GL40.glGenerateMipmap(GL40.GL_TEXTURE_2D);                                                                      // Create 2d mipmap from active texture
        return texId;
    }

    public void drawstring(float x,float y,float z, String string)
    {

    }

    /**
     * <h2>Splits a PNG tilesheet into an array of decoded PNG RGBA bytes</h2>
     * @param imageFile The tilesheet file to load
     * @param tileWidth The height of the image
     * @param tileHeight The witdh of the image
     * @return the ID of the texture once loaded. This id will be used to refer to it from now on.
     * @throws IOException If the image could not be accessed, read, split, or decoded.
     * @throws Exception if the tile data for slicing is not valid
     */
    public static ByteBuffer[] splitTilesheet(File imageFile, int tileWidth, int tileHeight, int cols) throws Exception {
        ArrayList<ByteBuffer> tile = new ArrayList<>();

        BufferedImage tilesheetImage = ImageIO.read(imageFile);

        if (tileWidth > tilesheetImage.getWidth())
            throw new Exception("Tile's width is declared larger than the tile sheet. That can't be right!");

        if (tileHeight > tilesheetImage.getHeight())
            throw new Exception("Tile's height is declared taller than the tile sheet. That can't be right!");

        if (tilesheetImage.getWidth() / tileWidth != cols)
            throw new Exception("Declared tile width does not match the calculated column width!");

        // There's no check for height, but if these all parse then the trust in the sheet data being correct is high.

        int idx = 0;
        for (int y = 0; y < tilesheetImage.getHeight() - (tilesheetImage.getHeight() % tileHeight); y += tileHeight) {
            for (int x = 0; x < tilesheetImage.getWidth() - (tilesheetImage.getWidth() % tileHeight); x += tileWidth) {
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(tilesheetImage.getSubimage(x, y, tileWidth, tileHeight), "png", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());
                PNGDecoder decoder = new PNGDecoder(is);
                ByteBuffer buff = ByteBuffer.allocateDirect(4 * tileHeight * tileWidth);
                decoder.decode(buff, tileWidth * 4, PNGDecoder.Format.RGBA);
                buff.flip();
                tile.add(buff);
                os.close();
                is.close();
                idx++;
            }
        }
        Debug.verbose("Split '" + imageFile.getName() + "' tilesheet, there are " + idx  + " tiles, which are each " +  + tileWidth + " x " + tileHeight);

        return tile.toArray(new ByteBuffer[0]);
    }

    /**
     * <h2>Sets quad blending for drawing tiles</h2>
     * Source = GL_ONE, Destination = GL_ONE_MINUS_SRC_ALPHA
     * <br>
     * <br>
     * Ensures that tiles are visible, and don't overdraw each other with thier black background.
     * <br>See OpenGL Blending
     */
    protected static void glTileBlendMode(){
        glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);
    }


    /**
     * <h2>Sets the z position in the frame to render to</h2>
     * Each renderer should have a unique z position, starting from 1.
     * This determines if this displays above or below the content produced by another renderer.
     * i.e content of a renderer at z = 2, will appear above the content produced by the renderer at z = 1.
     * @apiNote Renderers with the same z will merge content, adding the color values of both images into a single abomination of a final image.
     */
    public void setStackPosition(float f){
        StackPosition = f;
    }

    /**
     * <h2>Sets quad blending for drawing tiles</h2>
     * Source = GL_ONE, Destination = GL_ONE_MINUS_SRC_ALPHA
     */
    protected static void glOverdrawBlendMode(){
        //glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA); // It's the same as tile blending tho so
    }

    /**
     * <h2>Moves this renderer into the next z position.</h2>
     * @see Window#addRenderer(Renderer)
     */
    public void NextStackPosition() {
        StackPosition++;
    }

    /**
     * <h2>Overridable method to perform initalisation code before a renderer renders the first frame</h2>
     */
    public void preRender() {};

    /**
     * <h2>This renderer should now render to the frame buffer</h2>
     */
    public abstract void renderFrame();
}
