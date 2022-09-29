package level3.unit1.examples.e4_stupidBot

import com.anysolo.lib.student.console.enterString
import level3.unit1.examples.e3_rpn.rpnCalc


data class BotData(var name: String? = null, var debugMode: Boolean = false)


private const val incorrectCommandFormatError = "Incorrect command format"


private fun doNameCmd(botData: BotData, args: List<String>) {
    if(args.isEmpty()) {
        println(incorrectCommandFormatError)
        return
    }

    botData.name = args.joinToString(" ")

    println("Glad to see you ${botData.name}")
}


private fun doDebugCmd(botData: BotData, args: List<String>) {
    if(args.isEmpty()) {
        println(incorrectCommandFormatError)
        return
    }

    when(args[0]) {
        "on", "enable" -> botData.debugMode = true
        "off", "disable" -> botData.debugMode = false
        else -> println(incorrectCommandFormatError)
    }
}


private fun doHelpCmd(cmdItems: List<String>) {
    println("""
        Here is how to talk with me:
            bye - leave me along ;(
            name <you name> - tell me your name
            calc <RPN math expression>
            debug on|enable|off|disable - turn on/off debug prints
            help - print this help                                   
    """.trimIndent())
}


private fun startWithName(name: String?) {
    if(name != null) {
        print("$name, ")
    }
}


private fun doCalcCmd(botData: BotData, nprExpr: String) {
    val res = rpnCalc(nprExpr)
    if(res != null)
        println("It would be $res")
    else {
        startWithName(botData.name)
        println("the expression: \"$nprExpr\" is not a valid NPR expression for my humble calculator")
    }
}

private fun doUnknownCommand(botData: BotData, cmd: String) {
    startWithName(botData.name)
    println("I do not understand the command you entered: $cmd")
}


fun stupidBot(botData: BotData, commandString: String): Boolean {
    if(botData.debugMode)
        println("You say: $commandString")

    val cmdItems = commandString.split(" ")
    if(botData.debugMode) {
        println("cmdStr parsed into List<String>")
        println(cmdItems)
    }

    val cmd = cmdItems[0]
    val args = cmdItems.subList(1, cmdItems.size)
    val argStr = args.joinToString(" ")

    when(cmd) {
        "bye" -> return true
        "help" -> doHelpCmd(args)
        "name" -> doNameCmd(botData, args)
        "debug" -> doDebugCmd(botData, args)
        "calc" -> doCalcCmd(botData, argStr)
        else -> doUnknownCommand(botData, cmd)
    }

    return false
}


private fun doWelcome() {
    println("Hi, I am stupid bot version 1.0")
}


fun main() {
    val botData = BotData()

    doWelcome()
    doHelpCmd(listOf())

    while (true) {
        val cmdStr = enterString("\nCommand")

        if(stupidBot(botData, cmdStr))
            break
    }
}
