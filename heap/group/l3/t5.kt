/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/

/*******************************************************************************
 ******************************************************************************/

package level1.unit2.group.l3


fun main() {
    var n = 1
    var counter = 0

    while(true) {
        n *= 2

        if(n != 256 && counter <= 5)
            println(n)
        else
            break

        counter++
    }
}
