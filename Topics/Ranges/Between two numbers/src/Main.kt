import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val checkingNumber = scanner.nextInt()
    val range = scanner.nextInt()..scanner.nextInt()

    print(checkingNumber in range)
}