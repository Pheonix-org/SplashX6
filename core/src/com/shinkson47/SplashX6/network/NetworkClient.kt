package com.shinkson47.SplashX6.network

import com.badlogic.gdx.Gdx
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.load
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.update
import com.shinkson47.SplashX6.utility.Utility.warnDev
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket

/**
 * # A socket allowing this client to connect to a hosting client.
 */
object NetworkClient {
    var socket : Socket? = null
    lateinit var _clientInput  : ObjectInputStream
    lateinit var _clientOutput : ObjectOutputStream
    private lateinit var socketListener: NetworkClientListener

    var lastState: Packet? = null

    fun connect() {
        socket = Socket("localhost",25565)
        _clientOutput = ObjectOutputStream(socket!!.getOutputStream())
        _clientInput  = ObjectInputStream (socket!!.getInputStream())
                //TODO
        //GameData.networkSet(status.gameState!!)
    }

    fun postUpdate () {
        statusUpdate(read())
        send(Packet(PacketType.Ack))

        socketListener = NetworkClientListener()
        val thread = Thread(socketListener)
        socketListener.host = thread
    }

    private class NetworkClientListener() : Runnable {
        lateinit var host : Thread
        override fun run() {
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
    fun read() = _clientInput.readObject() as Packet

    fun isConnected() : Boolean = socket?.isConnected == true

    fun statusUpdate(pkt : Packet) {
        lastState = pkt
        if (pkt.gameState == null) {
            warnDev("Recieved an state update from server that contained no state!")
            return
        }

        with (lastState!!.gameState!!) {
            if (pkt.type == PacketType.Start)
                Gdx.app.postRunnable { load(this) }
            else
                Gdx.app.postRunnable { update(this) }
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        connect()
    }
}