import java.util.Scanner
const val FOUR = 4

fun main() {
    val scanner = Scanner(System.`in`)
    val numberOfElements = scanner.nextInt()
    val elements: MutableList<Int> = mutableListOf()
    repeat(numberOfElements) {
        elements.add(scanner.nextInt())
    }
    val divisibleByFour = elements.filter { it % FOUR == 0 }
    print(divisibleByFour.maxOrNull())
}