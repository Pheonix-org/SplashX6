package com.shinkson47.SplashX6.ai.statescript

import com.shinkson47.SplashX6.ai.StateMachine
import com.shinkson47.SplashX6.ai.statescript.antlr.StateScriptLexer
import com.shinkson47.SplashX6.ai.statescript.antlr.StateScriptParser
import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec
import org.antlr.v4.runtime.CharStreams
import java.io.File
import org.antlr.v4.runtime.tree.ParseTree

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.misc.Interval
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.nio.file.Paths
import kotlin.io.path.writeText
import kotlin.text.Charsets.UTF_8


/**
 * # Virtual Machine for the Shinkson's State Machine Scripting Lanauage
 * Translates .ss files to java.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 12/08/2021
 */
object SSVM {

    lateinit var output: TypeSpec.Builder
        private set;

    val constructor = MethodSpec.constructorBuilder()

    private val knownStates = ArrayList<String>();
    lateinit var fileString : String
    lateinit var name : String
    lateinit var defaultState : String


    @JvmStatic
    fun main(args: Array<String>) {
        // Check for no file.
        if (args.isEmpty()) throw IllegalArgumentException("No file provided.")

        if (args[0].endsWith(".ss")) {
            println("Compiling file : ${args[0]}")
        } else {
            error("Not a statescript file. Ensure file ends with *.ss : \n ${args[0]}")
        }

        // Read file.
        fileString = File(args[0]).readText()

        // Create a lexer with the text.
        val lexer = StateScriptLexer(CharStreams.fromString(fileString))

        // Tokenize text, then create a parser with the tokens.
        val parser = StateScriptParser(CommonTokenStream(lexer))

        println("\n\n============================================================")
        println("Parsing. Token errors below. Errors from within java code blocks may be ignored.")
        println("============================================================")
        // Create a parse tree of tokens from the entry rule of 'script'.
        val tree: ParseTree = parser.script()
        // Create a walker to traverse the tree.
        val walker = ParseTreeWalker()

        // Create a listener that will handle and execute tokens as we traverse the tree.
        val listener = SSVMListener()

        println("\n\n============================================================")
        println("Interpret and compile")
        println("============================================================")
        //====================================
        walker.walk(listener, tree)           // Compile the script.
        //====================================


        // Finish up any last java poet calls.
        constructor.addStatement("defaultState(${knownStates.indexOf(defaultState)});")
        output.addMethod(constructor.build())

        println("\n\n============================================================")
        println("Export")
        println("============================================================")
        println("Building javapoet data, and dumping to file.")
        // Finished. output java poet should be compiled. Dump to file.
        val file = JavaFile.builder("gen.shinkson47.SplashX6.ai.statescript", output.build())
            .build()
            .writeToPath(Paths.get("./"))


        // Post save code injection. Dodgy work around.
        // Reload the exported file, drop the curly bracket,
        // inject the code blocks, replace the bracket, save again.
        println("Modifying file : injecting code blocks and test main.")
        var fileContents = file.toFile().readText(UTF_8)
        fileContents = fileContents.dropLast(2)
        fileContents += "$code\n"

        // Inject a main to test with.
        fileContents +=
                "\tpublic static void main(String[] args) {\n" +
                "\t\tnew ${name}().run(100);\n" +
                "\t}\n}"

        file.writeText(fileContents, UTF_8)
    }

    @JvmStatic
    fun addState(name : String, behaviour: StateScriptParser.BehaviourContext, enterScript: StateScriptParser.EnterScriptContext?, exitScript: StateScriptParser.ExitScriptContext?) {
        println("Compiling state '$name'.")

        knownStates.add(name)
        constructor.addComment("State : $name")

        constructor.addStatement("""
            addState(new State(
                () -> ${origionalText(behaviour.block())},
                this,
                ${if (enterScript == null) "null" else "() -> ${enterScript.block().text}"},
                ${if (exitScript  == null) "null" else "() -> ${exitScript.block().text}"}
            ))
        """.trimIndent())

    }

    @JvmStatic
    fun setStateMachineName(name : String) {
        println("File contains machine called $name.")
        SSVM.name = name
        output = TypeSpec.classBuilder(name)
            .superclass(StateMachine::class.java)

        addClassJavadoc("<h1>$name</h1>\n")
    }

    @JvmStatic
    fun addClassJavadoc(test : String) {
        output.addJavadoc(strip(test))
    }

    var code = ""
    @JvmStatic
    fun addCode(block: StateScriptParser.BlockContext) {
        println("Injected a code block.")
        code += strip(origionalText(block))
    }

    @JvmStatic
    fun addSwitch(ctx: StateScriptParser.SwitchStateContext) {
        println("Added a state switch condition.")
        constructor.addComment("Switch : from ${ctx.Identifier(0)} to ${ctx.Identifier(1)}")
        constructor.addStatement("registerSwitchCondition(${knownStates.indexOf(ctx.Identifier(0).toString())}, ${knownStates.indexOf(ctx.Identifier(1).toString())}, unit -> ${if (ctx.IF() != null) strip(
            origionalText(ctx.parExpression())
        ) else "true" })")
    }

    private fun strip(string : String): String = string.drop(1).dropLast(1)

    private fun origionalText(behaviour : ParserRuleContext) : String
        = behaviour.start.inputStream.getText(Interval(behaviour.start.getStartIndex(), behaviour.stop.getStopIndex()));

    @JvmStatic fun setDefaultState(ctx: StateScriptParser.DefaultStateContext) {
        defaultState = ctx.Identifier().text
        println("Set default state to '$defaultState'.")
    }
}