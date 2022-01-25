package level3.unit1.examples.e8

import com.anysolo.lib.student.console.enterString


/***************************************
RPC (reverse polish logic) calculator

Calculates using Double type.
Supported operators: + - * /

examples:
Usual: 2 + 3
RPC: 2 3 +

Usual: (2 + 3) * 3
RPC 2 3 + 3 *
****************************************/


fun main() {
    println("RPC Micro v1.0")
    println("Please enter program or empty line to exit")

    while(true) {
        val prg = enterString("rpc> ", canBeEmpty = true)

        if(prg.isEmpty())
            break

        println(rpcCalc(prg))
    }
}
