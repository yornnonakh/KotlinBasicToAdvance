

// Clean Code: Use String for identifiers to prevent math errors and overflow

class VisaCard(
    val cardHolderName: String,
    val cardNumber: String,
    val cardType: String,
    val creditLimit: Double,
    var availableBalance: Double
) {

    // Clean Code: Extracted the masking logic to a private helper property for single responsibility
    private val maskedCardNumber: String
        get() = "**** **** **** ${cardNumber.takeLast(4)}"

    fun displayCardInfo() {
        println(
            """
            === Card Details ===
            Cardholder: $cardHolderName
            Card Number: $maskedCardNumber
            Card Type: $cardType
            Credit Limit: $$creditLimit
            Available Balance: $$availableBalance
            ====================
            """.trimIndent()
        )
    }

    fun makePayment(amount: Double) {

        // Clean Code: Guard clauses (early returns)
        // prevent deep nesting of if-else statements

        if (amount <= 0) {
            println("Payment Error: Amount must be greater than 0.")
            return
        }
        if (amount > availableBalance) {
            println("Payment Error: Insufficient funds. Available: $$availableBalance.")
            return
        }

        availableBalance -= amount
        println("Payment Success: $$amount paid. Remaining balance: $$availableBalance")
    }

    fun addCredit(amount: Double) {
        if (amount <= 0) {
            println("Credit Error: Amount must be greater than 0.")
            return
        }

        // Clean Code: Use Kotlin's idiomatic `coerceAtMost`
        // instead of writing a manual if-else check

        availableBalance = (availableBalance + amount).coerceAtMost(creditLimit)

        println("Credit Success: $$amount added. New balance: $$availableBalance")
    }

    // Clean Code: Use an expression body
    // (single-line function) for simple returns

    fun isPlatinumCard(): Boolean = cardType.equals("Platinum", ignoreCase = true)
}

fun main() {
    val myCard = VisaCard(

        cardHolderName = "Nona Yorn",
        cardNumber = "4111222233334444",
        cardType = "Platinum",
        creditLimit = 5000.0,
        availableBalance = 5000.0
    )

    myCard.displayCardInfo()
    println("Is Platinum: ${myCard.isPlatinumCard()}\n")

    // Will be capped at the 5000.0 credit limit
    myCard.makePayment(150.50)
    myCard.addCredit(500.0)
}