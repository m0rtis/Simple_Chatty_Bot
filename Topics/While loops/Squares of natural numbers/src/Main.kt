fun main() {
    val endOfSequence = readLine()!!.toInt()
    var currentNum: Int = 1
    while (currentNum * currentNum <= endOfSequence) {
        println(currentNum * currentNum)
        currentNum++
    }
}