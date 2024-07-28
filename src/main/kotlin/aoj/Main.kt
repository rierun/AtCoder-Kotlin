@kotlin.ExperimentalStdlibApi
fun main() {
    fun readln(): String = readLine()!!

    val n = readln().split(" ").map(String::toInt)
    println(n.sorted().joinToString(" "))
}