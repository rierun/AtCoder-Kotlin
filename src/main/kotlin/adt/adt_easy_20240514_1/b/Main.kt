import kotlin.math.pow

@kotlin.ExperimentalStdlibApi
fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    if (a - b <= 0) return println(1)
    var k = 32.0.pow(a - b).toInt()

    println(k)
}