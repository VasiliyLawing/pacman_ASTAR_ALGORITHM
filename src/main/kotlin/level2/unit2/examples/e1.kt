package level2.unit2.examples


// Create our own data type/class containing x,y coordinates in form of two Ints
data class Point(val x: Int, val y: Int)


fun main() {
    // Create a variable of Pos type
    val playerPos = Point(300,600)

    // Print it just for debugging porpoise.
    println("#1")
    println(playerPos)

    // You can access x and y separately
    println("#2")
    println("${playerPos.x}, ${playerPos.y}")

    // You can have as many variables of that type as you want
    val enemyPos = Point(100, 0)
    println("#3")
    println("playerPos=$playerPos, enemyPos=$enemyPos")
}
