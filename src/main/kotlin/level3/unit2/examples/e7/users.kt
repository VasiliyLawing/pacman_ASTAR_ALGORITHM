package level3.unit2.examples.e7


import level3Unit1Path
import java.io.File

typealias Users = List<UserData>

data class UserData(val username: String, val password: String, val accessLevel: Int)


fun loadUsers(): Users {
    val usersDataFile = File("$level3Unit1Path/e7/userdata.txt")
    val usersData = mutableListOf<UserData>()

    for(line in usersDataFile.readLines()) {
        val columns = line.split(" ")

        usersData.add(
            UserData(
            username = columns[0],
            password = columns[1],
            accessLevel = columns[2].toInt()
        )
        )
    }

    return usersData
}


fun authUser(users: Users, username: String, password: String): UserData? {
    for(u in users) {
        if(u.username == username && u.password == password) {
            return u
        }
    }

    return null
}


fun findUserByName(users: Users, username: String): UserData? {
    for(u in users) {
        if(u.username == username) {
            return u
        }
    }

    return null
}
