package rendering;

import de.matthiasmann.twl.utils.PNGDecoder;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL30;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glPopMatrix;

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

    public static final int TILE_WIDTH = 64, TILE_HEIGHT = TILE_WIDTH / 2;

    /**
     * <h2>Global store of ID's all textures loaded</h2>
     * Maps gl texture ID's to the texture name path
     */
    public static final Hashtable<Integer, String> textures = new Hashtable<>();

    public static boolean renderInitalised = false;

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
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);                                                                      // the window will be resizable

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
//        try (Stream<Path> paths = Files.walk(Paths.get(ClassLoader.getSystemResource("tilesets").toURI()))) {
//            paths
//                    .filter(Files::isRegularFile).forEach(v -> {RenderHelper.importTexture(v.toString()); System.out.println("Loaded " + v.toString());});
//        } catch (URISyntaxException | IOException e) {
//            // Resource folder not available.
//            e.printStackTrace();
//        }

        renderInitalised = true;
    }


    /**
     * <h2>Renders a quad to context with the current texture.</h2>
     * @param texture The gl texture ID to render
     * @param x x position
     * @param y y position
     */
    public void renderQuad(int texture, float x, float y) {
        renderQuad(texture, x, y, 0);
    }

    /**
     * <h2>Renders a quad to context with the current texture.</h2>
     * @param texture The gl texture ID to render
     * @param x x position
     * @param y y position
     */
    public void renderQuad(int texture, float x, float y, float z) {
        renderQuad(texture, x, y, z, Renderer.TILE_WIDTH, Renderer.TILE_HEIGHT);
    }

    /**
     * <h2>Renders a quad to context with the current texture.</h2>
     * @param texture The gl texture ID to render
     * @param x x position
     * @param y y position
     * @param w Quad width
     * @param h Quad height
     */
    public void renderQuad(int texture, float x, float y, float z, float w, float h) {
        glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_DECAL);                                                       // I have no idea what this does, but it's magic. Without it, quad textures appear blueish and dark.
        glPushMatrix();

            //glTranslatef(x, y, 0.0f);                                                                                 // Move to position to draw TODO is this needed?
            // set the color of the quad (R,G,B,A)

            glEnable(GL_TEXTURE_2D);// Enable 2d texture rendering on this quad
            glBlendFunc  (GL_ONE_MINUS_SRC_ALPHA, GL_SRC_ALPHA);
            glEnable     (GL_BLEND);
            glEnable     (GL_COLOR_MATERIAL);

            GL11.glColor4f(0,0,0,0);
            glBindTexture(GL_TEXTURE_2D, texture);                                                                      // select 2d texture to use by id

            glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);
        glBegin(GL_QUADS);                                                                                          // Notify we're drawing quad co-oords
                glTexCoord2f(1.0f, 1.0f);    glVertex3f(x, y, 0.0f);                                           // Plot all four corners of the quad
                glTexCoord2f(1.0f, 0.0f);    glVertex3f(x, y + h, 0.0f);                                    // VERT Co-ord : Placement of the quad's corners
                glTexCoord2f(0.0f, 0.0f);    glVertex3f(x + w, y + h, 0.0f);                             // TEX CO-ord : Placement of the texture within the quad. Value is from 0.0 to 1.0,
                glTexCoord2f(0.0f, 1.0f);    glVertex3f(x + w, y, 0.0f);                                    // representing 0 to 100 percentage of the parent quad.
            glEnd();                                                                                                    // Nofify we've finished drawing quad
        glPopMatrix();
    }

    /**
     * <h2>Loads a png into OpenGL</h2>
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

    public static int loadBufferedimageToOpenGL(BufferedImage image, int width, int height) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(image, "png", out);
        return loadBufferedimageToOpenGL(ByteBuffer.wrap(out.toByteArray()), width, height);
    }


    public static int loadBufferedimageToOpenGL(ByteBuffer buf, int width, int height){
        int texId = GL11.glGenTextures();                                                                               // Create a new texture object in memory, and get the id of it.
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texId);                                                                  // specify that this texture is 2D

        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);                                                         // specify length of color data in buffer, so it's read properly

        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, width, height, 0,                           // Place image buffer into memory
                GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, buf);

        GL30.glGenerateMipmap(GL11.GL_TEXTURE_2D);                                                                      // Create 2d mipmap from active texture
        return texId;
    }

    public static ByteBuffer[] splitTilesheet(File imageFile, int tileWidth, int tileHeight) throws IOException {
        ArrayList<ByteBuffer> tile = new ArrayList<>();

        BufferedImage tilesheetImage = ImageIO.read(imageFile);

        System.out.println("Segments are " + tileWidth + " x " + tileHeight);
        int idx = 0;
        for (int y = 0; y < tilesheetImage.getHeight(); y += tileHeight) {
            for (int x = 0; x < tilesheetImage.getWidth(); x += tileWidth) {
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

        return tile.toArray(new ByteBuffer[0]);
    }

    public void preRender() {};

    public abstract void renderFrame();
}
