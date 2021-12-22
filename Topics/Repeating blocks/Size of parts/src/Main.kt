import java.util.Scanner
const val LARGER = 1
const val SMALLER = -1
const val PERFECT = 0

fun main() {
    val scanner = Scanner(System.`in`)
    val numberOfParts = scanner.nextInt()
    val result: MutableMap<Int, Int> = mutableMapOf(
        Pair(PERFECT, 0),
        Pair(LARGER, 0),
        Pair(SMALLER, 0)
    )
    repeat(numberOfParts) {
        val size = scanner.nextInt()
        result.merge(size, 1, Int::plus)
    }
    print(result.values.joinToString(" "))
}