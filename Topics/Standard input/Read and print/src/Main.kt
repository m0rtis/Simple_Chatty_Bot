import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    for (i in 0 until 4) {
        if (i < 2) {
            println(scanner.nextLine())
        } else {
            println(scanner.nextInt())
        }
    }
}