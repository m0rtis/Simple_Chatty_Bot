const val TIMES_TO_REPEAT = 10

fun main() {
    val inputString = readLine()!!
    repeat(TIMES_TO_REPEAT) {
        println(inputString)
    }
}