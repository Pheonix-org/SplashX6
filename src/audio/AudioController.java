package audio;

import org.lwjgl.openal.*;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.libc.LibCStdlib.free;
import static utility.Utility.ioResourceToByteBuffer;

import static org.lwjgl.openal.AL10.*;
import org.lwjgl.system.MemoryUtil;
import utility.main;

import static org.lwjgl.system.MemoryUtil.*;

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


                //#region initalisation
                // Poll ALC for an identifier for the system's default sound card
                // Not sure what this enum code is, but it's one of two that actually retrieved my sound device instead of a software device
                String defaultDeviceName = alcGetString(0, 0x1012);

                // Open that sound card
                long device = alcOpenDevice(defaultDeviceName);

                // Creating the context
                // Context is the sound rendering 'scene' that is the context for all al instruction.
                // just like gl, al instructions operate on whatever context is currently assigned.
                // We're not parsing any arguments, but null is ambiguous so we cast it, that way it knows what call we want.

                // Like everything else, we only get an identifier to renference the newly created render context
                long context = alcCreateContext(device, (IntBuffer) null);

                // Set the render context we just created as the context for all future al instructions (until changed to another context)
                alcMakeContextCurrent(context);

                // Initalise Audio Library Context
                ALCCapabilities alcCapabilities = ALC.createCapabilities(device);

                // Initalise core AL. Returns an object containing the capabilities of the environment initalised.
                // If this object isn't used, we can remove it. Just call create capabilities and ignore what it returns.
                // There's no point wasting memory and time to store something we aren't using
                ALCapabilities alCapabilities = AL.createCapabilities(alcCapabilities);

                // Create a new sound source in our render scene
                // We can create as many sources as we'd like,
                // a few different sources to seperate background music and soundeffects
                // wouldn't go amis
                int source = alGenSources();
                // Once again, this is just an identifier pointing to the source we just made

                // Create a new audio data buffer for that source.
                // This is where we'll put data for the source to read and play
                int buffer = alGenBuffers();
                // Again, just a pointer

                // Assign that buffer to that source.
                // this call configures source preferences,
                // In this case we're altering the source we made above,
                //                    using the parameter key "AL_BUFFER", and changing the value
                //                    of that parameter to the buffer we just created.
                // there'll be a bunch of configurable parameters, the documentation should show all the keys

                //alSourcei(source, AL_BUFFER, buffer);

                // I wanted to assign the buffer here as a part of init, but if i did then it would give an
                // error code when loading to the buffer, and wouldn't load load the data to the buffer.

                long err = alGetError();

                // Some other configurable parameters of context's listener
                // and we'll do the same for the listener.
                // This'll put them on the same spot, creating a static-like
                // audio player. For this game we don't really care about where audio
                // sources are within the context of the scene, we just want the sound
                // in our ears.
                alListener3f(AL_POSITION, 0.0f,0.0f,0.0f);
                alListener3f(AL_VELOCITY, 0.0f,0.0f,0.0f);
                alListenerfv(AL_ORIENTATION, new float[]{0.0f, 0.0f, 0.0f});

                // Some other configurable parameters of the source
                //  We'll place it in the center of the scene context, with no motion.
                alSource3f(source, AL_VELOCITY, 0.0f,0.0f,0.0f);
                alSourcefv(source,AL_ORIENTATION, new float[]{0.0f, 0.0f, 0.0f});
                alSource3f(source, AL_POSITION, 0.0f,0.0f,0.0f);
                //#endregion initalisation

                //#region decoding audio

                // create virtual variables for native to return information
                //                stackPush();
                //                IntBuffer channelsBuffer = stackMallocInt(1);
                //                stackPush();
                //                IntBuffer sampleRateBuffer = stackMallocInt(1);
                // We're now using STBVorbisInfor, which stores both tthe channel and sample rate data of the audio - we can read
                // it from there instead.
                // we can tell stb to use this to store any error codes.
                IntBuffer error = stackMallocInt(1);

                // This will be used to store information about the track
                // This extends autoclosable, so it will free itself once we're no longer using it.
                // The others we will have to remember to free up ourselves when we're done with them.
                STBVorbisInfo info = STBVorbisInfo.malloc();

                // This info memory will be disposed once we've loaded our audio,
                // so create some java vars to stuff we'll need later to play it.

                // We could create a class which would represent a loaded track
                // and store all of it's data, then use that custom object to play
                // audio from instead. That way we could load the audio once,
                // and store a custom object with all the information
                // we need to play it again later.
                int channels = 0;
                int lengthSamples = 0;
                int sampleRate = 0;

                // Somewhere to store a reference to the audio in memory, once it's loaded into memory.
                ShortBuffer rawAudioBuffer;
                err = alGetError();
                // in a new frame, try to load and decode the audio
                try (MemoryStack stack = MemoryStack.stackPush()) {

                        // Read all bytes in the audio file, and store them in a buffer.
                        // Note this isn't a java buffer object of any kind, it's native.
                        // The bytes are written to memory in the native so that it may read them,
                        // we just had an object that represents it.

                        // This buffer size value i put as the size of the audio file on disk, but i don't really know what
                        // to put here atm. I tried 32 * 1024, and it seemed to make no difference so _-_

                        // I think it just needs to be long enough that the track can be loaded into it,
                        // it gets limited later.
                        ByteBuffer vorbis = ioResourceToByteBuffer("/audio/x.ogg", 10000000);

                        // Tell STB to load the data we wrote to memory.
                        // It may use the error buffer to write error codes, we'll check it later.
                        long decoder = stb_vorbis_open_memory(vorbis, error, null);

                        // A long cant be java null, but it can be a number
                        // that is associated with null. STB will return 0L, which is equal to
                        // memory util's NULL constant. It reads easier than "if decoder == 0L", but is the same.

                        // If no decoder was made, an error must have occoured. Throw exception with error code.
                        if (decoder == NULL)
                                throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));

                        // Tell vorbis to write information about our audio in memory to our info virtual variable.
                        stb_vorbis_get_info(decoder, info);

                        // Get the number of channels in the track
                        channels = info.channels();

                        // The number of samples to play a second, we'll need this to play it back at
                        // the correct speed.
                        sampleRate = info.sample_rate();

                        // Get the length of the memory in samples (The number of samples in this track)
                        lengthSamples = stb_vorbis_stream_length_in_samples(decoder);

                        // We have all the information we need to decode and load the audio.
                        // Allocate space that's the same size as the raw decoded audio in memory, so that we can store the result of the decode
                        rawAudioBuffer = MemoryUtil.memAllocShort(lengthSamples * channels);

                        // Ask STB to decode the data from our decoder, into our raw buffer.
                        // THEN use the resulting length of the track * the number of channels to limit the size of the memory used
                        // to match only what is needed.

                        rawAudioBuffer.limit(
                                stb_vorbis_get_samples_short_interleaved(decoder, channels, rawAudioBuffer)
                                * channels
                        );

                        err = alGetError();

                        // We've finished with our vorbis decoder, we can now close it. this frees the memory used to store the file.
                        stb_vorbis_close(decoder);

                        // free the memory used to store the file data?
                        //free(vorbis); // may crash. idk.
                } catch (IOException e) {
                        // error with loading or decoding the resource.
                        // report to main.fatal when merged
                    return;
                }

                // playing
                // we've decoded and stored the data but now we need to load it to
                // a source buffer so that the source can play it.

                // Finds the correct OpenAL format
                int format = -1;
                if(channels == 1) {
                        format = AL_FORMAT_MONO16;
                } else if(channels == 2) {
                        format = AL_FORMAT_STEREO16;
                }

                if (format == -1);
                        // No supported audio format, report to main.fatal when megerged.

                // Clear any errors, so that we can be sure that the error we're about to read came from this call.
                err = alGetError();
                // Place the audio we want to play into the buffer of the audio source that we want to play it.
                alBufferData(buffer, format, rawAudioBuffer, sampleRate);

                err = alGetError();
                if (err != AL_NO_ERROR);
                // Non fatal, but audio failed to play. We should still report it somehow. Possibly give the user the option to disable audio if it's being problematic.

                // This aparently has to be done after putting data into the buffer, else you can't
                // put data in the buffer. idk it this has to be done every time you want to play something.
                // It may be the case that a source plays a buffer, then frees it up again when it's done,
                // then you assign a new / same buffer every time you play.
                alSourcei(source, AL_BUFFER, buffer);

                // Free the memory allocated by STB
                // This crashed fatally in the native, not sure why.
                // Either way, in the game we should load audio and store
                // it somewhere. that way we could play it multiple times,
                // without having to load it from file every time.
                //free(rawAudioBuffer);

                // Tell the audio source to play whatever is in it's buffer
                alSourcePlay(source);

                // Cause this thread to halt untill the source has finished playing everything in it's buffer.
                // This was just to prevent the main() from exiting, terminating the program immediately after beginning to play.
                synchronized (Thread.currentThread()) {
                        while (alGetSourcei(source, AL_SOURCE_STATE) == AL_PLAYING);
                }

                // If we got to here, then the last error flag reset was after loading the buffer.
                // thus any error code must have come from playing the buffer.
                err = alGetError();
                if(err != AL_NO_ERROR);
                        // Again, non fatal but we should do something about it.
                        // Perhaps when you create the audio clip object, count numbers of errors
                        // encountered whilst playing it?
                        // If it fails to play that track x number of times, disable it so we don't keep trying to
                        // play something that we know isn't wanting to play.

                // Programme is closing,
                /* Terminate OpenAL */
                // This should only be done once, at the end.
                // Once merged, call from main.shutdown. The game will
                // then close open al when it closes graciously.

                // We should also free any memory holding song data (rawAudioBuffer)

                alDeleteSources(source);
                alDeleteBuffers(buffer);
                alcDestroyContext(context);
                alcCloseDevice(device);
        }
}
