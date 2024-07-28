@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = ""

    // 入力
    val n = readln().toInt()

    // 処理
    for (i in 1..n) {
        ans += n
    }

    // 出力
    println(ans)
}