package level3.unit2.examples.e7


data class CommandContext(val users: Users, val currentUser: UserData)


fun execCommand(commandContext: CommandContext, cmd: String): Boolean {
    var needExit = false

    when(cmd.split(" ").first()) {
        "quit" -> needExit = true
        "send" -> cmdSendMessage(commandContext, cmd)
    }

    return needExit
}

private fun cmdSendMessage(commandContext: CommandContext, cmd: String) {
    val columns = cmd.split(" ")

    if(columns.size < 3) {
        println("Incorrect command arguments: $cmd")
        return
    }

    val usernameTo = columns[1]
    val message = columns.subList(2, columns.size).joinToString(" ")

    val userTo = findUserByName(commandContext.users, usernameTo)
    if(userTo == null) {
        println("Cannot find user: $usernameTo")
        return
    }

    writeMessage(commandContext.currentUser.username, usernameTo, message)
}
