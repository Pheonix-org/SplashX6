/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.network

import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.NationType
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.debug.Console
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.BindException
import java.net.ServerSocket
import java.net.Socket
import java.net.SocketException



/**
 * # A server socket that can be used to connect other clients to a game loaded on this client.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 */
// This architecture is a mess.
object Server {

    /**
     * # Pool of sockets to communicate to clients.
     * One client per thread.
     */
    private var socketConnectionThreads : ArrayList<Thread> = ArrayList()

    /**
     * The runnables inside of [socketConnectionThreads]
     */
    private var clientConnections : ArrayList<clientConnection> = ArrayList()


    /**
     * # A socket which can be used to talk to clients.
     */
    lateinit var socket : ServerSocket;

    /**
     * Indicates weather or not the server is running.
     */
    var alive: Boolean = false
        private set(value) {
            field = value
            stopAllThreads()
        }

    /**
     * # A thread which runs in the [socketPool] talks to a single [NetworkClient] via a [socket]
     */
    private class clientConnection : Runnable {
        lateinit var _clientSocket : Socket
        lateinit var _clientInput  : ObjectInputStream
        lateinit var _clientOutput : ObjectOutputStream

        /**
         * Flag indicating this connection is bad.
         *
         * If true When this thread is used to send a packet,
         * the thread is closed.
         */
        var dirty : Boolean = false

        /**
         * Flag indicating that this connection is still open.
         */
        var running : Boolean = true

        /**
         * A queue of [Packet]s posted for the thread to send to the client asyncronously.
         *
         * This avoids other threads, especially the rendering thread, from pausing to talk over
         * the network; that's the job of this thread.
         */
        @Volatile private var packetQueue = ArrayList<Packet>()

        /**
         * Determines if this thread has connected to a client.
         *
         * false if waiting idle for a new client, or has been marked dirty.
         */
        fun isConnected() = this::_clientSocket.isInitialized && _clientSocket.isConnected && !dirty


        override fun run() {
            try {
                // Open thread. Listen for a new client trying to connect.
                _clientSocket = socket.accept()

                // immediately start a new thread to replace this one in
                // waiting for a new client to connect.
                newSocketThread()

                _clientInput = ObjectInputStream(_clientSocket.getInputStream())
                _clientOutput = ObjectOutputStream(_clientSocket.getOutputStream())

                // Notify of connection
                onClientConnect(this)

                // Identifies this client, and thier place in the game.
                // This will [kick] this client if the server is already in-game,
                // and they do not exist within the game
                identify()

                // Don't continue if the client was kicked during ident.
                if(!running) return
                // TODO check that packets after here are queued.

                // Update the client as to the status of the game.
                status()
                // TODO noftify who's turn it is

                // Main client communication loop.
                while (running) {
                    if (packetQueue.isNotEmpty())
                        drainQueue()
                }
            } catch (e : java.lang.Exception) {
                println("Server thread crashed!")
                //Console.log(e)
                e.printStackTrace()
            }


            _clientSocket.close()
        }

        /**
         * Sends all queued packets to the client.
         *
         * Intended to be ran on the client thread.
         */
        @Synchronized
        private fun drainQueue() {
            synchronized(packetQueue) {
                ArrayList(packetQueue).apply {
                    forEach { implSend(it) }
                    packetQueue.removeAll(this.toSet())
                }
            }
        }

        /**
         * Gracefully stop the thread, and notify that
         * a client has disconnected.
         */
        fun closeConnection() {

            if (isConnected()) {
                running = false
                drainQueue()
                _clientSocket.close()
            }

            onClientDisconnect(this)
        }

        /**
         * Forcefully ejects this player's connection.
         */
        fun kick() {
            // Don't bother sending any queued packets.
            packetQueue.clear()

            // Notify client of disconnect
            send(Packet(PacketType.Disconnect))

            // Close connection to the client.
            closeConnection()
        }

        /**
         * Identifies the connected client.
         */
        private fun identify() {
            // Retrieve the username from the client.
            val clientsUserName = implSend(Packet(PacketType.Identify))?.data as String

            // Check to see if they're in the game.
            GameData.findNationByName(clientsUserName)?.let {
                // They do; An existing player of this game is re-connecting.
                Thread.currentThread().name = "Server connection to $clientsUserName"
                Utility.warnPlayer("Existing player re-joined game : $clientsUserName")
            } ?: run {
                // They don't; A new player is connecting. Has the game started yet?
                if (Client.client.screen is WorldCreation) {
                    Hypervisor.nation_new(NationType.china, userName = clientsUserName)
                    //Console.log("New player joined the game : $ID")
                } else {
                    // Too late to join; game has started without this player.
                    Utility.warnPlayer("$clientsUserName tried tried to join, but was rejected because the game has started without them.")
                    kick()
                }
            }
        }

        /**
         * # Sends the status of the game to the client.
         */
        // TODO this needs to also notify whose turn it is. Maybe include it in the data?
        fun status() {
            if (Client.client.screen is GameScreen)
                send(Packet(PacketType.Start, GameData, GameData.currentPlayerIndex))
            else
                send(Packet(PacketType.Status, GameData, GameData.currentPlayerIndex))
        }

        /**
         * Queues a packet to be sent to the client asyncronously
         */
        @Synchronized
        fun send(packet: Packet) {
            packetQueue.add(packet)
        }

        /**
         * Actually sends a packet to the client.
         *
         * Will resend if the client asks.
         *
         * @return the client's response, or null if no [isConnected].
         */
        private fun implSend(packet: Packet): Packet? {
            if (isConnected()) {
                while (true) {
                    println("Server (${Thread.currentThread().name}) sending : $packet")
                    Packet.send(packet, _clientInput, _clientOutput)

                    val response = read()
                    println("Server (${Thread.currentThread().name}) received : $response in response to $packet")
                    if (response.type != PacketType.Resend)
                        return response
                    else println("Server (${Thread.currentThread().name}) is re-sending : $packet by request")
                }
            } else return null
        }

        /**
         * Reads a packet from the client.
         */
        private fun read() : Packet = _clientInput.readObject() as Packet
    }

    private fun newSocketThread() =
        clientConnection().let {
            clientConnections.add(it)
            Thread(it).let { socketConnectionThreads.add( it.also { it.start() }); it }
        }

    /**
     * invokes [serverSocketThread#closeConnection] on all connections.
     */
    private fun stopAllThreads() = clientConnections.forEach { it.closeConnection() }

    // ============================================
    //#region           Power
    // ============================================

    /**
     * Starts the server
     *
     * @return true if the server started successfully.
     */
    fun boot() : Boolean {
        if (!alive) {
            try {
                socket = ServerSocket(25565)
            } catch (e : BindException) {
                e.printStackTrace()
                return false
            }

            // Start the first client connection.
            // It will start replacements automatically when consumed
            // by a client.
            alive = newSocketThread().isAlive
        }

        return printStatus()
    }

    /**
     * Closes the server
     */
    fun shutdown()  {
        if (!alive) return

        alive = false

        stopAllThreads()

        socket.close()

        socketConnectionThreads.forEach { it.stop() }
        socketConnectionThreads.clear()
        clientConnections.clear()

        printStatus()
    }

    private fun printStatus() : Boolean {
        Console.log("server ${if (alive) "alive" else "dead"}")
        return alive
    }

    // ============================================
    //#endregion        Power
    //#region           Internal
    // ============================================

    /**
     * # A client has just connected. Handle it.
     */
    private fun onClientConnect(client : clientConnection) {

    }

    /**
     * # A client has just disconnected.
     */
    private fun onClientDisconnect(client : clientConnection) {

    }

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
    fun turn()  {

    }

    fun poll()  {}

    // ============================================
    //#endregion        API
    // ============================================

    fun sendToAllClients(pkt : Packet) {
        clientConnections.forEach {
            try {
                it.send(pkt)
            } catch (e : SocketException) { it.dirty; it.closeConnection() }
        }

        clientConnections.removeIf { it.dirty }
        socketConnectionThreads.removeIf { !it.isAlive }
        System.gc();
    }

    fun updateAllClients() {
        sendToAllClients(Packet(PacketType.Ping))
        clientConnections.map { it.status() }

    }
}