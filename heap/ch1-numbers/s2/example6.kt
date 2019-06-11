package ch1.s2


fun main() {
    val annualIncome = 170000.0

    var taxes: Double
    if(annualIncome < 70000.0)
        taxes = annualIncome * 0.15
    else
        taxes = annualIncome * 0.25

    val netIncome = annualIncome - taxes

    println("Income: $annualIncome")
    println("Taxes: $taxes")
    println("Net income: $netIncome")
}
