const val TENS = 2

fun main() {
    val number = readLine()!!.toInt().toString()
    print(number[number.length - TENS])
}