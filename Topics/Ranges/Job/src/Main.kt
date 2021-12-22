const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 59

fun main() {
    val age = readLine()!!.toInt()
    print(age in AGE_OF_MAJORITY..RETIREMENT_AGE)
}