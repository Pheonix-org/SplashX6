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

import com.badlogic.gdx.Gdx
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.load
import com.shinkson47.SplashX6.game.GameHypervisor.update
import com.shinkson47.SplashX6.utility.Utility.warnDev
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.OptionalDataException
import java.io.StreamCorruptedException
import java.lang.Exception
import java.net.Socket

/**
 * # A socket allowing this client to connect to a hosting client.
 */
object NetworkClient {
    var socket : Socket? = null
    lateinit var _clientInput  : ObjectInputStream
    lateinit var _clientOutput : ObjectOutputStream
    private lateinit var socketListener: NetworkClientListener

    var hasStarted: Boolean = false

    var lastState: Packet? = null
        private set

    fun connect() {
        hasStarted = false
        socket = Socket("localhost",25565)
        _clientOutput = ObjectOutputStream(socket!!.getOutputStream())
        _clientInput  = ObjectInputStream (socket!!.getInputStream())
                //TODO
        //GameData.networkSet(status.gameState!!)

        socketListener = NetworkClientListener()
        val thread = Thread(socketListener)
        socketListener.host = thread.apply { start() }
    }

    fun resetConnection() {
        println("Connection reset.")
        socketListener.host.interrupt()
        socketListener.host.stop()
        connect()
    }

    fun postUpdate () {
        statusUpdate(read())
    }

    private class NetworkClientListener() : Runnable {
        lateinit var host : Thread
        override fun run() {
            while (!this::host.isInitialized);
            while (!host.isInterrupted) {
                val pkt = read()
                when (pkt.type) {
                    PacketType.Ping -> send(Packet(PacketType.Pong))
                    PacketType.Pong -> warnDev("The server sent the client a random pong?")
                    PacketType.Ack -> warnDev("The server sent the client a random ack?")
                    PacketType.Status -> statusUpdate(pkt)
                    PacketType.Start -> statusUpdate(pkt)
                    PacketType.End -> TODO("The client doesn't know how to repond to the server.")
                    PacketType.Disconnect -> TODO("The client doesn't know how to repond to the server.")
                }
            }
        }
    }

    fun send(packet: Packet) = Packet.send(packet, _clientInput, _clientOutput)
    fun read() : Packet {
        while (true) {
            try {
                return _clientInput.readObject() as Packet
            } catch (e: Exception) {
                if (e is StreamCorruptedException)
                    resetConnection();
                println("Failed to read a packet. Requesting resend. ${e.message}")
                send (Packet(PacketType.Resend))
            }
            send(Packet(PacketType.Ack))
            // TODO implement a max retry count.
        }
    }

    fun isConnected() : Boolean = socket?.isConnected == true

    fun statusUpdate(pkt : Packet) {
        lastState = pkt
        if (pkt.gameState == null) {
            warnDev("Recieved an state update from server that contained no state!")
            return
        }

        with (lastState!!.gameState!!) {
            if (pkt.type == PacketType.Start)
                hasStarted = true
            else
                Gdx.app.postRunnable { update(this) }
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        connect()
    }
}