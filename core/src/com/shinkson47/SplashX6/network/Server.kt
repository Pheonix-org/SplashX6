package com.shinkson47.SplashX6.network

import com.shinkson47.SplashX6.game.GameData
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.ServerSocket
import java.net.Socket


/**
 * # A server socket that can be used to connect other clients to a game loaded on this client.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 */
object Server {

    /**
     * # Pool of sockets.
     */
    private var socketConnectionThreads : ArrayList<Thread> = ArrayList()
    private var socketConnections : ArrayList<serverThreadRunnable> = ArrayList()

    /**
     * # A socket which can be used to talk to clients.
     */
    val socket = ServerSocket(25565)



    /**
     * # A thread which runs in the [socketPool] talks to a single [Client] via [socket]
     */
    private class serverThreadRunnable : Runnable {
        lateinit var _clientSocket : Socket
        lateinit var _clientInput  : ObjectInputStream
        lateinit var _clientOutput : ObjectOutputStream
        var running : Boolean = true


        override fun run() {
            // Open thread. Listen for a new client trying to connect.
            _clientSocket = socket.accept()
            _clientInput  = ObjectInputStream (_clientSocket.getInputStream())
            _clientOutput = ObjectOutputStream(_clientSocket.getOutputStream())

            onClientConnect()
            status()
            newSocketThread()
//
//            while (running) {
//
//            }
        }

        fun stop() {
            running = false

            onClientDisconnect()
        }

        /**
         * # Sends the status of the game to the client.
         */
        fun status() {
            send(Packet(PacketType.Status, GameData))
        }

        fun send(packet: Packet) = Packet.send(packet, _clientInput, _clientOutput)
    }

    private fun newSocketThread() {
        val r = serverThreadRunnable()
        socketConnectionThreads.add(Thread(r))
        socketConnectionThreads.last().start()
        socketConnections.add(r)
    }

    private fun stopAllThreads() {
        socketConnections.forEach { it.stop() }
    }


    // ============================================
    //#region           Power
    // ============================================

    fun boot()      {
        newSocketThread()
    }

    fun shutdown()  {

    }

    // ============================================
    //#endregion        Power
    //#region           Internal
    // ============================================

    /**
     * # A client has just connected. Handle it.
     */
    private fun onClientConnect() {}

    /**
     * # A client has just disconnected.
     */
    private fun onClientDisconnect() {}



    // ============================================
    //#endregion        Internal
    //#region           API
    // ============================================

    /**
     * Local or remote
     *
     * pass to remote, wait for end
     * notify all clients
     * pass to next remote and repeat
     *
     * pass to local, and wait for turn end.
     */
    fun turn()  {}

    fun poll()  {}

    // ============================================
    //#endregion        API
    // ============================================

    @JvmStatic
    fun main(args: Array<String>) {
        boot()
    }
}