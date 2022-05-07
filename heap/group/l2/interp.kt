package level2.group

import java.io.File
import java.util.*


enum class TokenType {
    constant,
    operator
}


val allOperators = listOf("+", "-", "*", "/", "print", "printStack")


fun detectTokenType(token: String) =
    when {
        token.first().isDigit() -> TokenType.constant
        token in allOperators -> TokenType.operator
        else -> RuntimeException("Unknown operator \"$token\"")
    }


fun printStack(stack: Stack<Int>) {
    println("Stack:")
    for(n in stack) {
        println(n)
    }
    println()
}

fun execLine(stack: Stack<Int>, command: String) {
    val tokens = command.split(" ")

    for (token in tokens) {
        val tokenType = detectTokenType(token)

        when(tokenType) {
            TokenType.constant -> stack.push(token.toInt())
            TokenType.operator -> execOperator(stack, token)
        }
    }
}

fun execOperator(stack: Stack<Int>, operator: String) {
    when(operator) {
        "+" -> {
            val n1 = stack.pop()!!
            val n2 = stack.pop()!!
            stack.push(n1 + n2)
        }

        "-" -> {
            val n1 = stack.pop()!!
            val n2 = stack.pop()!!
            stack.push(n1 - n2)
        }

        "*" -> {
            val n1 = stack.pop()!!
            val n2 = stack.pop()!!
            stack.push(n1 * n2)
        }

        "/" -> {
            val n1 = stack.pop()!!
            val n2 = stack.pop()!!
            stack.push(n1 / n2)
        }

        "print" -> println(stack.pop()!!)

        "printStack" -> printStack(stack)
    }
}


fun main(args: Array<String>) {
    val codeFilename = args[0]
    val codeLines = File(codeFilename).readLines()

    val stack = Stack<Int>()

    for(line in codeLines) {
        execLine(stack, line)
    }
}
