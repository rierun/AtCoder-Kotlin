import kotlin.math.pow

@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()

    println(if (2.0.pow(n.toDouble()) > n.toDouble().pow(2.0)) "Yes" else "No")
}