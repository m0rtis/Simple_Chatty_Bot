fun main() {
    val num = readLine()!!.toInt()
    var digitOfSequence = 1
    val output = mutableListOf<Int>()
    while (output.size <= num) {
        repeat(digitOfSequence) { output.add(digitOfSequence) }
        digitOfSequence++
    }
    println(output.subList(0, num).joinToString(" "))
}