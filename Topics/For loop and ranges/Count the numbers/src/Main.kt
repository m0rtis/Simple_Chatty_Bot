import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val range = scanner.nextInt()..scanner.nextInt()
    val divider = scanner.nextInt()
    var counter = 0
    for (i in range) {
        if (i % divider == 0) {
            counter++
        }
    }
    print(counter)
}