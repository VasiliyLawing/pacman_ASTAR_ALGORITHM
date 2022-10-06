/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/

/*******************************************************************************
 ******************************************************************************/

package level1.unit2.group

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep

fun checkPassword(code: IntArray): Boolean {
    return code[0] == 9 && code[1] == 2 && code[2] == 3
}

fun main() {
    var a = IntArray(3)

    for(d1 in 0..9) {
        a[2] = d1
        for (d2 in 0..9) {
            a[1] = d2
            for (d3 in 0..9) {
                a[0] = d3
                if(checkPassword(a)) {
                    println("$d3$d2$d1")
                    return
                }
            }
        }
    }
}
