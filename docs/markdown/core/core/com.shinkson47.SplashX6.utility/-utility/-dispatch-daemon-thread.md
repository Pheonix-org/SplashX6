//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[DispatchDaemonThread](-dispatch-daemon-thread.md)

# DispatchDaemonThread

[jvm]\
open fun [DispatchDaemonThread](-dispatch-daemon-thread.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), r: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)): [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

Dispatches a headless helper thread that is executing r.

#### Return

Reference to the created thread.

## Parameters

jvm

| | |
|---|---|
| r | The runnable to execute in the thread. |
| name | Name to be given to the thread. |
