fun main() {
    val startRange = readLine()!!.toInt()
    val finishRange = readLine()!!.toInt()
    var acc: Long? = null
    for (i in startRange until finishRange) {
        acc = if (acc == null) i.toLong() else acc * i.toLong()
    }
    print(acc)
}