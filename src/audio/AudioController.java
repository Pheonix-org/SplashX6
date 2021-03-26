package audio;

import org.lwjgl.openal.ALC;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.ALCCapabilities;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.openal.AL10.alGenBuffers;
import static org.lwjgl.openal.AL10.alGetError;
import static org.lwjgl.openal.ALC10.*;

// TODO loop main menu music
// TODO skip various in game music
/**
 * <h1>Audio</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author Dylan Brand 25/03/2021
 * @version 1
 */
public class AudioController {

    public static void init() {

// Can call "alc" functions at any time
        Long device = alcOpenDevice((ByteBuffer)null);
        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        //TODO check for a null device

        long context = alcCreateContext(device, (IntBuffer)null);
        alcMakeContextCurrent(context);
        AL.createCapabilities(deviceCaps);

        // Generate the buffers
        alGetError(); // Clears error code
        //TODO return no error
        alGenBuffers();
    }

}
