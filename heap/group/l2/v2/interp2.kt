package level2.group.v2

import java.io.File
import java.util.*


enum class TokenType {
    constant,
    operator
}


val allOperators = listOf("+", "-", "*", "/", "print", "save", "load", "printStack")


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

fun execLine(stack: Stack<Int>, command: String, registers: IntArray) {
    val tokens = command.split(" ")

    for (token in tokens) {
        val tokenType = detectTokenType(token)

        when(tokenType) {
            TokenType.constant -> stack.push(token.toInt())
            TokenType.operator -> execOperator(stack, token, registers)
        }
    }
}

fun execOperator(stack: Stack<Int>, operator: String, registers: IntArray) {
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

        "save" -> {
            val register = stack.pop()!!
            val value = stack.pop()!!
            registers[register] = value
        }

        "load" -> {
            val register = stack.pop()!!
            stack.push(registers[register])
        }

        "printStack" -> printStack(stack)
    }
}


fun main(args: Array<String>) {
    val codeFilename = args[0]
    val codeLines = File(codeFilename).readLines()

    val stack = Stack<Int>()
    val registers = IntArray(16)

    for(line in codeLines) {
        execLine(stack, line, registers)
    }
}
