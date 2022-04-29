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

import com.badlogic.gdx.Game
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game._GameData
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class Packet(val type : PacketType, val gameState : _GameData? = null, val data: Any? = null) : Serializable {
    companion object {
        fun send(packet : Packet, _in : ObjectInputStream, _out : ObjectOutputStream)  {
            _out.writeObject(packet)
        }
    }

    override fun toString() = "Packet { $type, ${if (gameState == null) "no" else "has"} game data, ${if (data == null) "no" else "has"} misc data }"
}

enum class PacketType : Serializable {
    // Simple connection test
    Ping,
    Pong,

    Ack,
    Resend,

    // Messages / requests
    Status,      // Request a copy of the game data
    Start,       // Nofify a client that it's now it's turn in the game.
    End,         // Notify the server that the client has ended it's turn.
    Disconnect,
    Identify
}


/**
 * # An object which formulates a response to a given packet.
 */
abstract class PacketHandler {
    abstract fun handle(packet : Packet) : Packet?
}


object ServerPacketHandler : PacketHandler() {
    override fun handle(packet: Packet): Packet? {
        return when (packet.type) {
            PacketType.Identify -> Packet(PacketType.Identify)
            PacketType.Ping     -> Packet(PacketType.Pong)
            PacketType.End      -> Packet(PacketType.Ack)
            PacketType.Status   ->  {
                NetworkClient.statusUpdate(packet)
                Server.updateAllClients()

                null
            }
            PacketType.Disconnect-> Packet(PacketType.Ack)

            // Things the server shouldn't receive from the client.
            PacketType.Start    -> null
            PacketType.Pong     -> null
            PacketType.Ack      -> null
            PacketType.Resend   -> null
        }
    }
}

///**
// * # [PacketHandler] for a client.
// * Responds to server packets
// */
//object ClientPacketHandler : PacketHandler() {
//    override fun handle(packet: Packet) : Packet? {
//        return when (packet.type) {
//            // Things the client should not receive from the server
//            PacketType.Ping     -> null
//
//
//            // Things that require no response
//            PacketType.Pong     -> null
//            PacketType.Ack      -> null
//            PacketType.Status   -> {
//                GameData.networkSet(packet.gameState!!)
//                null
//            }
//            PacketType.Start    -> null
//            PacketType.End      -> null
//            PacketType.Disconnect-> null
//            PacketType.Resend   -> null
//        }
//    }
//}


