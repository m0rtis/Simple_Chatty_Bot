import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val gradesMap: Map<Int, Char> = mapOf(
        Pair(2, 'D'),
        Pair(3, 'C'),
        Pair(4, 'B'),
        Pair(5, 'A')
    )
    val grades: MutableMap<Char, Int> = mutableMapOf(
        Pair('A', 0),
        Pair('B', 0),
        Pair('C', 0),
        Pair('D', 0)
    )
    val numberOfStudents = scanner.nextInt()
    repeat(numberOfStudents) {
        val grade = scanner.nextInt()
        grades.merge(gradesMap[grade]!!, 1, Int::plus)
    }

    print("${grades['D']} ${grades['C']} ${grades['B']} ${grades['A']}")
}
