package rendering.gui;

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
public class FrameRoot extends GUIComponent {

    public FrameRoot(int x, int y, int width, int height, GUIWindow parent) {
        super(x, y, width, height, parent);
    }

    public FrameRoot(Rectangle rect, GUIWindow parent) {
        super(rect, parent);
    }

    @Override
    public void renderComponent() {

    }
}
