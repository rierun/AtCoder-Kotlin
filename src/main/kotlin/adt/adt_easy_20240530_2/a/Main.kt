@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = "No"

    // 入力
    val (a, b) = readln().split(" ").map { it.toInt() }

    // 処理
    val ba = if (b % 2 == 0) b / 2 else (b - 1) / 2
    if (a == ba) {
        ans = "Yes"
    }

    // 出力
    println(ans)
}