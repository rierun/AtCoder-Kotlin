@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = 0

    // 入力
    val (n, p) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }

    // 処理
    a.forEach {
        if (it < p) {
            ans++
        }
    }

    // 出力
    println(ans)
}