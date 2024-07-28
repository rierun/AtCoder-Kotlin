@kotlin.ExperimentalStdlibApi
fun main() {
    val (a, b) = readln().split(" ").map { it.toDouble() }

    val ans = String.format("%.3f", b / a)

    println(ans)
}   