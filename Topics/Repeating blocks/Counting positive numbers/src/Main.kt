import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val sequenceLength = scanner.nextInt()
    var positiveCount = 0
    repeat(sequenceLength) {
        if (scanner.nextInt() > 0) {
            positiveCount++
        }
    }

    print(positiveCount)
}