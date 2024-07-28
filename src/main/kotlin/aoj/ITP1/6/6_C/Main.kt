@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)

    // 入力
    val n = readln().toInt()
    val p = List(4) { List(3) { MutableList(10) { 0 } } }

    // 処理
    for (i in 0 until n) {
        val (b, f, r, v) = readStrings().map { it.toInt() }
        p[b - 1][f - 1][r - 1] += v
    }

    // 出力
    for (b in 0..3) {
        println(" ${p[b][0].joinToString(" ")}")
        println(" ${p[b][1].joinToString(" ")}")
        println(" ${p[b][2].joinToString(" ")}")
        if (b != 3) println("####################")
    }
}