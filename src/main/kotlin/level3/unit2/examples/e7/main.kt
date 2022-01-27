package level3.unit2.examples.e7


import com.anysolo.lib.student.console.enterString



fun main() {
    val users = loadUsers()

    val username = enterString("Username")
    val password = enterString("Password")

    val userData = authUser(users, username, password)
    if(userData == null) {
        println("Access not authorized")
        return
    }

    println("Welcome ${userData.username}")

    if(userData.accessLevel == 1) {
        println("You have normal user access")
    }

    if(userData.accessLevel == 2) {
        println("You have admin privileges")
    }

    val messages = readMessages(userData)
    if(messages.isNotEmpty()) {
        printMessages(messages)
    }

    val commandContext = CommandContext(users, userData)

    while (true) {
        val command = enterString("cmd> ")
        if(execCommand(commandContext, command))
            break
    }

    println("Good bye. See you later.")
}
