import java.util.Scanner

const val NUMBER_OF_WORDS = 5

fun main() {
    val scanner = Scanner(System.`in`)
    for (i in 0 until NUMBER_OF_WORDS) {
        println(scanner.next())
    }
}