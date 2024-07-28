@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = 0

    // 入力
    val (a, b, k) = readln().split(" ").map { it.toLong() }
    var s = a

    // 処理
    while (s < b) {
        s *= k
        ans++
    }

    // 出力
    println(ans)
}