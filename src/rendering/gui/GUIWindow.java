package rendering.gui;

import rendering.Renderer;
import rendering.Window;
import rendering.WorldRenderer;
import utility.main;

import java.awt.*;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 30/03/2021</a>
 * @version 1
 * @since v1
 */
public class GUIWindow extends Renderer {

    private final FrameRoot root;

    public GUIWindow(int x, int y, int width, int height){
        this(new Rectangle(x,y,width,height));
    }

    public GUIWindow(Rectangle rect){
        root = new FrameRoot(rect, this);
    }


    /**
     * <h2>Overridable method to perform initalisation code before a renderer renders the first frame</h2>
     */
    @Override
    public void doPreRender() {

    }

    /**
     * <h2>This renderer should now render to the frame buffer</h2>
     */
    @Override
    public void doRender() {
        root.render();
    }

    public void show(){
        main.window.addRenderer(this);
    }

    public void hide(){
        main.window.stripRenderer(this);
    }
}
