import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val listOfWords: MutableList<String> = mutableListOf()
    while (scanner.hasNext()) {
        listOfWords.add(scanner.next())
    }
    println(listOfWords.joinToString(" "))
}