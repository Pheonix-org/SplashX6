//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[ProductionManager](index.md)/[queueProject](queue-project.md)

# queueProject

[jvm]\
fun [queueProject](queue-project.md)(project: [PT](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Adds a new project to the queue.

Has no effect if the queue if full, as determined by [isQueueFull](is-queue-full.md)

#### Return

true if project was added, else false (i.e [isQueueFull](is-queue-full.md))

## Parameters

jvm

| | |
|---|---|
| project | Project |
