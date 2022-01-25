package level3.unit1.examples.e8


typealias Stack = MutableList<Double>

private fun isOp(op: String) = op in listOf("+", "-", "*", "/")


private fun push(stack: Stack, num: Double) = stack.add(num)
private fun pop(stack: Stack): Double = stack.removeLast()


private fun doOp(stack: Stack, op: String) {
    when(op) {
        "+" -> push(stack, pop(stack) + pop(stack))
        "-" -> push(stack, pop(stack) - pop(stack))
        "*" -> push(stack, pop(stack) * pop(stack))
        "/" -> push(stack, pop(stack) / pop(stack))
    }
}


private fun doCmd(stack: Stack, cmd: String) {
    val num = cmd.toDoubleOrNull()

    when {
        num != null -> push(stack, num)
        isOp(cmd) -> doOp(stack, cmd)
        else -> println("Error command: $cmd")
    }
}

fun rpcCalc(prgSource: String): Double {
    val stack = mutableListOf<Double>()
    val prg = prgSource.split(" ")

    for(cmd in prg) {
        doCmd(stack, cmd)
    }

    return pop(stack)
}
