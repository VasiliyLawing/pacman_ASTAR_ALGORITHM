package level1.group

import kotlin.random.Random


fun main() {
    val min = 200
    val max = 500

    repeat(100) {
        val num = Random.nextInt(1, 1000)

        //---------------------------

        if(num >= min && num <= max) {
            println(num)
        }

        //---------------------------
    }
}
