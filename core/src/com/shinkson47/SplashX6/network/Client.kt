package com.shinkson47.SplashX6.network

import com.shinkson47.SplashX6.game.GameData
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket

/**
 * # A socket allowing this client to connect to a hosting client.
 */
object Client {
    var socket : Socket? = null
    lateinit var _clientInput  : ObjectInputStream
    lateinit var _clientOutput : ObjectOutputStream

    fun connect() {
        socket = Socket("localhost",25565)
        _clientOutput = ObjectOutputStream(socket!!.getOutputStream())
        _clientInput  = ObjectInputStream (socket!!.getInputStream())


        val status = _clientInput.readObject() as Packet
        send(Packet(PacketType.Ack))
        GameData.networkSet(status.gameState!!)
    }

    fun send(packet: Packet) = Packet.send(packet, _clientInput, _clientOutput)




    @JvmStatic
    fun main(args: Array<String>) {
        connect()
    }
}