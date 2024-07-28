@kotlin.ExperimentalStdlibApi
fun main() {
    val ans: String
    // 入力
    readLine()!!
    val a = readLine()!!.split(" ").map { it.toLong() }

    // 処理
    ans = "%d %d %d".format(a.minOrNull()!!, a.maxOrNull()!!, a.sum())

    // 出力
    println(ans)
}