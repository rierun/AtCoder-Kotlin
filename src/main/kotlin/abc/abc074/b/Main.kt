import kotlin.math.min

@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val x = readln().split(" ").map(String::toInt)

    // 処理
    var a = 0
    for (i in 0 until n) {
        a += min(x[i] * 2, (k - x[i]) * 2)
    }

    println(a)
}