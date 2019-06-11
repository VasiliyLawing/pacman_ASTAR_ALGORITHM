package ch1.s2


fun main() {
    // Try to assign different numbers to 'n' and check how all these 'if' behave
    val n = 4

    // Comparision operators compare two values
    // All comparision operators: '<', '>', '<=', '>=', '==' and '!='

    // You can combine comparison operators using '&&' and '||'.
    // '&&' means AND
    // '||' means OR.
    // Such operators called "logical operators"
    if(n < 10 && n % 2 == 0)
        println("$n is even and less then 10")

    if(n <= 10)
        println("$n is less then 10 or equal to 10")

    if(n == 10)
        println("$n is exactly 10")

    if(n != 10)
        println("$n is not 10")

    // Examples with comparsion and logical operators together
    if(n >= 3 && n <= 7)
        println("$n is inside rage 3 .. 7. Including 3 and 7")

    if(n < 3 || n > 7)
        println("$n is outside rage 3 .. 7. Including 3 and 7")
}
