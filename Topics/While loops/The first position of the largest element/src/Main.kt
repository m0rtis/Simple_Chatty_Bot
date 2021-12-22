import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var position = 1
    var currentMax = Int.MIN_VALUE
    var currentMaxPosition = 1
    while (scanner.hasNextInt()) {
        val currentNumber = scanner.nextInt()
        if (currentMax < currentNumber) {
            currentMax = currentNumber
            currentMaxPosition = position
        }
        position++
    }
    println("$currentMax $currentMaxPosition")
}