package ch1.s2


fun main() {
    val annualIncome = 170000.0

    // When result of if operator is a value you can use if as an expression
    // It is going to be equal to one of the two expressions you specify before and after "else"
    var taxes = if(annualIncome < 70000.0)
        annualIncome * 0.15
    else
        annualIncome * 0.25

    // Imagine our hypothetical government do not want you to pay more then 200,000 taxes, no matter what the income
    if(taxes > 200000)
        taxes = 200000.0

    val netIncome = annualIncome - taxes

    println("Income: $annualIncome")
    println("Taxes: $taxes")
    println("Net income: $netIncome")
}
