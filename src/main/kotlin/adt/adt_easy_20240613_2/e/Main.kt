@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, k) = readln().split(" ").map(String::toInt)

    data class Student(val id: Int, val score: Int)
    val students = List(n) {
        val (a, b, c) = readln().split(" ").map(String::toInt)
        Student(it, a + b + c)
    }

    val border = students.sortedBy { it.score }.reversed()[k - 1].score

    // 処理
    for (i in students) {
        if (i.score + 300 >= border) println("Yes") else println("No")
    }
}