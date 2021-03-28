package audio;

import org.lwjgl.openal.*;


import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.stb.STBVorbis.stb_vorbis_decode_filename;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.libc.LibCStdlib.free;


// TODO loop main menu music
// TODO skip various in game music
/**
 * <h1>Game Audio</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author Dylan Brand 25/03/2021
 * @version 1
 */
public class AudioController {

        // Good progress, null pointer error thrown, will be resolved.
        // Pushing this class to update the remote.
        public static void main(String[] args) {

                // Creating the default device
                String defaultDeviceName = alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER);
                long device = alcOpenDevice(defaultDeviceName);

                // Creating the context
                int[] attributes = {0}; // Array containing 0, indicating we are passing no attributes
                long context = alcCreateContext(device, attributes);
                alcMakeContextCurrent(context);

                // Creating the ALCCapabilities object for Audio Library Context
                ALCCapabilities alcCapabilities = ALC.createCapabilities(device);
                // Creating the ALCapabilities object for core AL
                ALCapabilities alCapabilities = AL.createCapabilities(alcCapabilities);



                // Destroys the context ond closes the device once OpenAL is no longer used.
                alcDestroyContext(context);
                alcCloseDevice(device);


                /* Loading the sound */
                String fileName = "AndrewBeck-Strings.ogg";

                // Allocate space to store return information
                stackPush();
                IntBuffer channelsBuffer = stackMallocInt(1);
                stackPush();
                IntBuffer sampleRateBuffer = stackMallocInt(1);

                ShortBuffer rawAudioBuffer = stb_vorbis_decode_filename(fileName, channelsBuffer, sampleRateBuffer);

                // Retrieve the information that was stored
                int channels = channelsBuffer.get();
                int sampleRate = sampleRateBuffer.get();

                // Free the space we allocated
                stackPop();
                stackPop();


                /* Sending the data an OpenAL buffer */
                // Finds the corrext OpenAL format
                int format = -1;
                if(channels == 1) {
                        format = AL_FORMAT_MONO16;
                } else if(channels == 2) {
                        format = AL_FORMAT_STEREO16;
                }

                // Request space for the buffer
                int bufferPointer = alGenBuffers();

                // Send data to OpenAL
                alBufferData(bufferPointer, format, rawAudioBuffer, sampleRate);

                // Free the memory allocated by STB
                free(rawAudioBuffer);


                /* Playing the sound */
                int sourcePointer = alGenSources();

                // Assigning the buffer to the source
                alSourcei(sourcePointer, AL_BUFFER, bufferPointer);

                alSourcePlay(sourcePointer);

//                int error = alGetError();
//                if(error != AL_NO_ERROR) {
//                        // Error handling.
//                }

                /* Terminate OpenAL */
                alDeleteSources(sourcePointer);
                alDeleteBuffers(bufferPointer);
                alcDestroyContext(context);
                alcCloseDevice(device);
        }
}
