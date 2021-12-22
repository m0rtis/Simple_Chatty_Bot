import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val number = scanner.nextInt()
    println("Symbol # $number of the string \"$string\" is '${string[number - 1]}'")
}