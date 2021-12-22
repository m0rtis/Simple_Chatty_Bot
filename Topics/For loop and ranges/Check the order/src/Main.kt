import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numberOfNumbers = scanner.nextInt()
    var result = "YES"
    var previous: Int? = null
    for (i in 1..numberOfNumbers) {
        val current = scanner.nextInt()
        if (previous != null && current <= previous) {
            result = "NO"
        }
        previous = current
    }
    print(result)
}