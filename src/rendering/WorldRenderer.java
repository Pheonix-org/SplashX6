package rendering;

import de.matthiasmann.twl.utils.PNGDecoder;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL30;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glPopMatrix;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class TileRenderer extends Renderer {
    //#region constants
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    private void texturedQuadTest(int texture,
                                  float x,
                                  float y,
                                  float w,
                                  float h)
    {
        glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_DECAL);
        glPushMatrix();
        glTranslatef(x, y, 0.0f);

        glBindTexture(GL_TEXTURE_2D, texture);
        glEnable(GL_TEXTURE_2D);

        glBegin(GL_QUADS);
        glTexCoord2f(0.0f, 0.0f);    glVertex3f(x, y, 0.0f);
        glTexCoord2f(0.0f, 1.0f);    glVertex3f(x, y + h, 0.0f);
        glTexCoord2f(1.0f, 1.0f);    glVertex3f(x + w, y + h, 0.0f);
        glTexCoord2f(1.0f, 0.0f);    glVertex3f(x + w, y, 0.0f);
        glEnd();

        glPopMatrix();
    }
    //#endregion operations

    //#region static
    //#endregion static
}
