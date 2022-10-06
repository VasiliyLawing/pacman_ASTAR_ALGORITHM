/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level3.unit2.examples.e6


import level3Unit2Path
import java.io.File


private val messagesPath = "$level3Unit2Path/e7/msgData/"


data class Message(val usernameFrom: String, val message: String)

typealias Messages = List<Message>


fun writeMessage(usernameFrom: String, usernameTo: String, message: String) {
    val messagesFile = File("$messagesPath/${usernameTo}.txt")
    if(!messagesFile.exists())
        messagesFile.createNewFile()

    messagesFile.appendText("$usernameFrom|$message\n")
}


fun readMessages(user: UserData): Messages {
    val messagesFile = File("$messagesPath/${user.username}.txt")
    if(!messagesFile.exists())
        return emptyList()

    val lines = messagesFile.readLines()
    val messages = mutableListOf<Message>()

    for(line in lines) {
        val columns = line.split("|")
        val msg = Message(usernameFrom = columns[0], message = columns[1])
        messages.add(msg)
    }

    messagesFile.writeText("")

    return messages
}


fun printMessages(messages: Messages) {
    println("You have ${messages.size} messages")

    for(msg in messages) {
        println("${msg.usernameFrom}: ${msg.message}")
    }
}
