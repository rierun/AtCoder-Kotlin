@kotlin.ExperimentalStdlibApi
fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val r = (1..3)
    val ans = if (a != b) r.first { it != a && it != b } else -1



    println(ans)
}