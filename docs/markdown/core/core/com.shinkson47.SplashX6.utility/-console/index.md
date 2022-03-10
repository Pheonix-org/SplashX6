//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Console](index.md)

# Console

[jvm]\
object [Console](index.md) : GUIConsole

## Types

| Name | Summary |
|---|---|
| [SystemListener](-system-listener/index.md) | [jvm]<br>class [SystemListener](-system-listener/index.md) : [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)<br>A simple thread which listens for input in the system terminal, and forwards it into the [Console](index.md). |
| [X6CommandExecutor](-x6-command-executor/index.md) | [jvm]<br>class [X6CommandExecutor](-x6-command-executor/index.md) : CommandExecutor |

## Functions

| Name | Summary |
|---|---|
| [clear](index.md#1958694439%2FFunctions%2F971615585) | [jvm]<br>open override fun [clear](index.md#1958694439%2FFunctions%2F971615585)() |
| [deselect](index.md#1449605673%2FFunctions%2F971615585) | [jvm]<br>open override fun [deselect](index.md#1449605673%2FFunctions%2F971615585)() |
| [dispose](index.md#-1077328683%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](index.md#-1077328683%2FFunctions%2F971615585)() |
| [draw](index.md#-1214731262%2FFunctions%2F971615585) | [jvm]<br>open override fun [draw](index.md#-1214731262%2FFunctions%2F971615585)() |
| [enableSubmitButton](index.md#-2014018914%2FFunctions%2F971615585) | [jvm]<br>open override fun [enableSubmitButton](index.md#-2014018914%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [execCommand](index.md#-2036427541%2FFunctions%2F971615585) | [jvm]<br>open override fun [execCommand](index.md#-2036427541%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [getDisplayKeyID](index.md#-1295585210%2FFunctions%2F971615585) | [jvm]<br>open override fun [getDisplayKeyID](index.md#-1295585210%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getInputProcessor](index.md#1655925302%2FFunctions%2F971615585) | [jvm]<br>open override fun [getInputProcessor](index.md#1655925302%2FFunctions%2F971615585)(): InputProcessor |
| [getWindow](index.md#974770222%2FFunctions%2F971615585) | [jvm]<br>open override fun [getWindow](index.md#974770222%2FFunctions%2F971615585)(): Window |
| [hitsConsole](index.md#242329026%2FFunctions%2F971615585) | [jvm]<br>open override fun [hitsConsole](index.md#242329026%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDisabled](index.md#1678587073%2FFunctions%2F971615585) | [jvm]<br>open override fun [isDisabled](index.md#1678587073%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDisplayHiddenCommandsEnabled](index.md#688864112%2FFunctions%2F971615585) | [jvm]<br>open override fun [isDisplayHiddenCommandsEnabled](index.md#688864112%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isExecuteHiddenCommandsEnabled](index.md#-2028513053%2FFunctions%2F971615585) | [jvm]<br>open override fun [isExecuteHiddenCommandsEnabled](index.md#-2028513053%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isVisible](index.md#-1574019732%2FFunctions%2F971615585) | [jvm]<br>open override fun [isVisible](index.md#-1574019732%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [log](index.md#475697461%2FFunctions%2F971615585) | [jvm]<br>open override fun [log](index.md#475697461%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>open override fun [log](index.md#-902701476%2FFunctions%2F971615585)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html))<br>open override fun [log](index.md#143137924%2FFunctions%2F971615585)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html), p1: LogLevel)<br>open override fun [log](index.md#1583496284%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: LogLevel) |
| [printCommands](index.md#-1758651202%2FFunctions%2F971615585) | [jvm]<br>open override fun [printCommands](index.md#-1758651202%2FFunctions%2F971615585)() |
| [printHelp](index.md#-2081280385%2FFunctions%2F971615585) | [jvm]<br>open override fun [printHelp](index.md#-2081280385%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [printLogToFile](index.md#810636019%2FFunctions%2F971615585) | [jvm]<br>open override fun [printLogToFile](index.md#810636019%2FFunctions%2F971615585)(p0: FileHandle)<br>open override fun [printLogToFile](index.md#1934711275%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [refresh](index.md#-972659815%2FFunctions%2F971615585) | [jvm]<br>open override fun [refresh](index.md#-972659815%2FFunctions%2F971615585)()<br>open override fun [refresh](index.md#-173307106%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [resetInputProcessing](index.md#1308483928%2FFunctions%2F971615585) | [jvm]<br>open override fun [resetInputProcessing](index.md#1308483928%2FFunctions%2F971615585)() |
| [select](index.md#1424368906%2FFunctions%2F971615585) | [jvm]<br>open override fun [select](index.md#1424368906%2FFunctions%2F971615585)() |
| [setCommandExecutor](index.md#59508680%2FFunctions%2F971615585) | [jvm]<br>open override fun [setCommandExecutor](index.md#59508680%2FFunctions%2F971615585)(p0: CommandExecutor) |
| [setConsoleStackTrace](index.md#-1585558022%2FFunctions%2F971615585) | [jvm]<br>open override fun [setConsoleStackTrace](index.md#-1585558022%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setDisabled](index.md#1409650715%2FFunctions%2F971615585) | [jvm]<br>open override fun [setDisabled](index.md#1409650715%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setDisplayHiddenCommands](index.md#576537754%2FFunctions%2F971615585) | [jvm]<br>open override fun [setDisplayHiddenCommands](index.md#576537754%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setDisplayKeyID](index.md#-1535274024%2FFunctions%2F971615585) | [jvm]<br>open override fun [setDisplayKeyID](index.md#-1535274024%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setExecuteHiddenCommands](index.md#-1752059961%2FFunctions%2F971615585) | [jvm]<br>open override fun [setExecuteHiddenCommands](index.md#-1752059961%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setHoverAlpha](index.md#-469124255%2FFunctions%2F971615585) | [jvm]<br>open override fun [setHoverAlpha](index.md#-469124255%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setHoverColor](index.md#1260104508%2FFunctions%2F971615585) | [jvm]<br>open override fun [setHoverColor](index.md#1260104508%2FFunctions%2F971615585)(p0: Color) |
| [setLoggingToSystem](index.md#1673944741%2FFunctions%2F971615585) | [jvm]<br>open override fun [setLoggingToSystem](index.md#1673944741%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setMaxEntries](index.md#-1613128156%2FFunctions%2F971615585) | [jvm]<br>open override fun [setMaxEntries](index.md#-1613128156%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setNoHoverAlpha](index.md#656420384%2FFunctions%2F971615585) | [jvm]<br>open override fun [setNoHoverAlpha](index.md#656420384%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setNoHoverColor](index.md#2004544029%2FFunctions%2F971615585) | [jvm]<br>open override fun [setNoHoverColor](index.md#2004544029%2FFunctions%2F971615585)(p0: Color) |
| [setPosition](index.md#2144184150%2FFunctions%2F971615585) | [jvm]<br>open override fun [setPosition](index.md#2144184150%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setPositionPercent](index.md#538859763%2FFunctions%2F971615585) | [jvm]<br>open override fun [setPositionPercent](index.md#538859763%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setSize](index.md#1505014190%2FFunctions%2F971615585) | [jvm]<br>open override fun [setSize](index.md#1505014190%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setSizePercent](index.md#1969088411%2FFunctions%2F971615585) | [jvm]<br>open override fun [setSizePercent](index.md#1969088411%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setSubmitText](index.md#-2102084905%2FFunctions%2F971615585) | [jvm]<br>open override fun [setSubmitText](index.md#-2102084905%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [setTitle](index.md#1678744852%2FFunctions%2F971615585) | [jvm]<br>open override fun [setTitle](index.md#1678744852%2FFunctions%2F971615585)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [setVisible](index.md#165043995%2FFunctions%2F971615585) | [jvm]<br>open override fun [setVisible](index.md#165043995%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [consoleTrace](index.md#-440457511%2FProperties%2F971615585) | [jvm]<br>val [consoleTrace](index.md#-440457511%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [disabled](index.md#-1041273013%2FProperties%2F971615585) | [jvm]<br>val [disabled](index.md#-1041273013%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [displayHiddenCommands](index.md#635287615%2FProperties%2F971615585) | [jvm]<br>val [displayHiddenCommands](index.md#635287615%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [exec](index.md#1236162518%2FProperties%2F971615585) | [jvm]<br>val [exec](index.md#1236162518%2FProperties%2F971615585): CommandExecutor |
| [executeHiddenCommands](index.md#-2053405140%2FProperties%2F971615585) | [jvm]<br>val [executeHiddenCommands](index.md#-2053405140%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [log](index.md#-1918893009%2FProperties%2F971615585) | [jvm]<br>val [log](index.md#-1918893009%2FProperties%2F971615585): Log |
| [logToSystem](index.md#2057559237%2FProperties%2F971615585) | [jvm]<br>val [logToSystem](index.md#2057559237%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
