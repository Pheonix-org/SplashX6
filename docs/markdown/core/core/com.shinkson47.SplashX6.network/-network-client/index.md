//[core](../../../index.md)/[com.shinkson47.SplashX6.network](../index.md)/[NetworkClient](index.md)

# NetworkClient

[jvm]\
object [NetworkClient](index.md)

# A socket allowing this client to connect to a hosting client.

## Functions

| Name | Summary |
|---|---|
| [connect](connect.md) | [jvm]<br>fun [connect](connect.md)() |
| [isConnected](is-connected.md) | [jvm]<br>fun [isConnected](is-connected.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [main](main.md) | [jvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [main](main.md)(args: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [postUpdate](post-update.md) | [jvm]<br>fun [postUpdate](post-update.md)() |
| [read](read.md) | [jvm]<br>fun [read](read.md)(): [Packet](../-packet/index.md) |
| [resetConnection](reset-connection.md) | [jvm]<br>fun [resetConnection](reset-connection.md)() |
| [send](send.md) | [jvm]<br>fun [send](send.md)(packet: [Packet](../-packet/index.md)) |
| [statusUpdate](status-update.md) | [jvm]<br>fun [statusUpdate](status-update.md)(pkt: [Packet](../-packet/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [_clientInput](_client-input.md) | [jvm]<br>lateinit var [_clientInput](_client-input.md): [ObjectInputStream](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInputStream.html) |
| [_clientOutput](_client-output.md) | [jvm]<br>lateinit var [_clientOutput](_client-output.md): [ObjectOutputStream](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutputStream.html) |
| [hasStarted](has-started.md) | [jvm]<br>var [hasStarted](has-started.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [lastState](last-state.md) | [jvm]<br>var [lastState](last-state.md): [Packet](../-packet/index.md)? = null |
| [socket](socket.md) | [jvm]<br>var [socket](socket.md): [Socket](https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html)? = null |
