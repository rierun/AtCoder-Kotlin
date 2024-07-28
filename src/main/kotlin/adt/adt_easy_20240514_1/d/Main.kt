@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }

    val ans: Int = 4 * (1..n).sum() - a.sum()

    println(ans)
}   