package rendering.gui;
import java.awt.*;

import static org.lwjgl.opengl.GL40.*;
import static rendering.Renderer.glTileBlendMode;


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
public abstract class GUIComponent {
    //#region fields
    public final GUIWindow parent;
    public final Rectangle rect;
    public float r = .1f, g = .1f, b = .1f, a = .9f;
    //#endregion fields

    //#region constructors
    public GUIComponent(int x, int y, int width, int height, GUIWindow parent) {
        this(new Rectangle(x,y, width, height), parent);
    }

    public GUIComponent(Rectangle rect, GUIWindow parent) {
        this.rect = rect;
        this.parent = parent;
    }

    public void render(){
        glColor4f(r,g,b,a);
        glTileBlendMode();
        parent.renderQuad(0, rect.x, rect.y, rect.width, rect.height);
        renderComponent();
    }

    public abstract void renderComponent();


    //#endregion constructors

}
