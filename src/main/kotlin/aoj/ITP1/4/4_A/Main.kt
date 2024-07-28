@kotlin.ExperimentalStdlibApi
fun main() {
    val ans: String
    // 入力
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    ans = "%d %d %f".format(a / b, a % b, a.toDouble() / b)
    // 出力
    println(ans)
}