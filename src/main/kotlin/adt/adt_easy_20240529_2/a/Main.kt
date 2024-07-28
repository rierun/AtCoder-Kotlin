@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = ""

    // 入力
    val n = readln().toInt()

    // 処理
    if (42 <= n) {
        ans = "AGC${(n + 1).toString().padStart(3, '0')}"
    } else {
        ans = "AGC${n.toString().padStart(3, '0')}"
    }


    // 出力
    println(ans)
}