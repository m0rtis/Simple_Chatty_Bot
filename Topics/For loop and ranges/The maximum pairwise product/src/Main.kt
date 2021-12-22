fun main() {
    val number = readLine()!!.toInt()
    val numbersList: MutableList<Int> = MutableList(number) { readLine()!!.toInt() }
    val firstMaxIndex = numbersList.indexOfFirst { it == numbersList.maxOrNull() }
    val firstMaxNumber = numbersList[firstMaxIndex]
    numbersList.removeAt(firstMaxIndex)
    val secondMaxNumber = if (numbersList.isNotEmpty()) numbersList.maxOrNull() else 1

    print(firstMaxNumber * secondMaxNumber!!)
}