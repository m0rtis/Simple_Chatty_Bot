fun main() {
    var balance = readLine()!!.toInt()
    val expenses: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    expenses.forEach {
        if (balance - it >= 0) {
            balance -= it
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $it.")
            return
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}