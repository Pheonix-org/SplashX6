//[core](../../../index.md)/[com.shinkson47.SplashX6.network](../index.md)/[Server](index.md)

# Server

[jvm]\
object [Server](index.md)

# A server socket that can be used to connect other clients to a game loaded on this client.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021

## Functions

| Name | Summary |
|---|---|
| [boot](boot.md) | [jvm]<br>fun [boot](boot.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [main](main.md) | [jvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [main](main.md)(args: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [poll](poll.md) | [jvm]<br>fun [poll](poll.md)() |
| [printStatus](print-status.md) | [jvm]<br>fun [printStatus](print-status.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [sendToAllClients](send-to-all-clients.md) | [jvm]<br>fun [sendToAllClients](send-to-all-clients.md)(pkt: [Packet](../-packet/index.md)) |
| [shutdown](shutdown.md) | [jvm]<br>fun [shutdown](shutdown.md)() |
| [turn](turn.md) | [jvm]<br>fun [turn](turn.md)()<br>Local or remote |

## Properties

| Name | Summary |
|---|---|
| [alive](alive.md) | [jvm]<br>var [alive](alive.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [socket](socket.md) | [jvm]<br>lateinit var [socket](socket.md): [ServerSocket](https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html) |
