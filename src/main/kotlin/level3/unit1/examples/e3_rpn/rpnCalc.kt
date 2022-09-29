package level3.unit1.examples.e3_rpn


typealias Stack = MutableList<Double>

private fun isOp(op: String) = op in listOf("+", "-", "*", "/")


private fun push(stack: Stack, num: Double) = stack.add(num)

private fun pop(stack: Stack): Double? {
    if(stack.isEmpty())
        return null

    return stack.removeLast()
}


private fun doOp(stack: Stack, op: String) {
    val arg1 = pop(stack)
    val arg2 = pop(stack)

    if(arg1 == null || arg2 == null)
        return

    when(op) {
        "+" -> push(stack,  arg1 + arg2)
        "-" -> push(stack, arg1 - arg2)
        "*" -> push(stack, arg1 * arg2)
        "/" -> push(stack, arg1 / arg2)
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


fun rpnCalc(prgSource: String): Double? {
    val stack = mutableListOf<Double>()
    val prg = prgSource.split(" ")

    for(cmd in prg) {
        doCmd(stack, cmd)
    }

    return pop(stack)
}
