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

import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
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
object Server {

    /**
     * # Pool of sockets.
     */
    private var socketConnectionThreads : ArrayList<Thread> = ArrayList()
    private var socketConnections : ArrayList<serverThreadRunnable> = ArrayList()

    var alive: Boolean = false
        private set

    /**
     * # A socket which can be used to talk to clients.
     */
    lateinit var socket : ServerSocket;



    /**
     * # A thread which runs in the [socketPool] talks to a single [NetworkClient] via [socket]
     */
    private class serverThreadRunnable : Runnable {
        lateinit var _clientSocket : Socket
        lateinit var _clientInput  : ObjectInputStream
        lateinit var _clientOutput : ObjectOutputStream
        var running : Boolean = true

        fun isConnected() = this::_clientSocket.isInitialized && _clientSocket.isConnected


        override fun run() {
            // Open thread. Listen for a new client trying to connect.
            _clientSocket = socket.accept()
            _clientInput  = ObjectInputStream (_clientSocket.getInputStream())
            _clientOutput = ObjectOutputStream(_clientSocket.getOutputStream())

            onClientConnect()
            status()
            newSocketThread()
        }

        fun stop() {
            running = false
            onClientDisconnect()
        }

        /**
         * # Sends the status of the game to the client.
         */
        fun status() {
            if (Client.client.screen is GameScreen)
                send(Packet(PacketType.Start, GameData))
            else
                send(Packet(PacketType.Status, GameData))
        }

        fun send(packet: Packet) {
            if (isConnected()) {
                while (true) {
                    Packet.send(packet, _clientInput, _clientOutput)
                    val response = read()
                    if (response.type != PacketType.Resend)
                        break
                }
            }
        }

        fun read() : Packet {
            return _clientInput.readObject() as Packet
        }
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

    fun boot() : Boolean {
        if (!alive) {
            try {
                socket = ServerSocket(25565)
            } catch (e : BindException) {
                e.printStackTrace()
                return false
            }
            newSocketThread()
        }
        alive = socketConnectionThreads.last().isAlive
        return printStatus()
    }

    fun shutdown()  {
        if (!alive) return

        alive = false
        socket.close()

        socketConnections.forEach { it.stop() }
        socketConnections.clear()

        socketConnectionThreads.forEach { it.stop() }
        socketConnectionThreads.clear()
        printStatus()
    }

    fun printStatus() : Boolean {
        println("server ${if (alive) "alive" else "dead"}")
        return alive
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

    fun sendToAllClients(pkt : Packet) {
        socketConnections.forEach {
            it.send(pkt)
        }
    }
}