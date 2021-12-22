import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val firstRange = scanner.nextInt()..scanner.nextInt()
    val secondRange = scanner.nextInt()..scanner.nextInt()
    val checkingNumber = scanner.nextInt()

    print(checkingNumber in firstRange || checkingNumber in secondRange)
}