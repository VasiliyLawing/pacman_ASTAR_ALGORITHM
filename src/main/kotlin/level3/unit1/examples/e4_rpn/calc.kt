package level3.unit1.examples.e4_rpn

import com.anysolo.lib.student.console.enterString


/***************************************
Reverse Polish notation (RPN) calculator

Calculates using Double type.
Supported operators: + - * /

examples:
Usual: 2 + 3
RPC: 2 3 +

Usual: (2 + 3) * 3
RPN 2 3 + 3 *
****************************************/


fun main() {
    println("RPN Micro v1.0")
    println("Please enter program or empty line to exit")

    while(true) {
        val prg = enterString("rpn> ", canBeEmpty = true)

        if(prg.isEmpty())
            break

        println(rpnCalc(prg))
    }
}