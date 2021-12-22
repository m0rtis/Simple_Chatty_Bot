import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var acc = 0
    var nextInt: Int? = null
    while (nextInt != 0) {
        nextInt = scanner.nextInt()
        acc += nextInt
    }
    println(acc)
}