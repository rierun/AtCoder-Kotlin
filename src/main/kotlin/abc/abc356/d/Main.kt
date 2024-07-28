@kotlin.ExperimentalStdlibApi
fun main() {
    // 入力
    val (n, m) = readln().split(" ").map { it.toLong() }

    // 処理
    var a = 0
    for (k in 0..n) {
        val and = k and m
        // 1のビット数を数える
        a += and.toString(2).count { it == '1' }
    }

    // 998244353で割った余りを求める
    val ans = a % 998244353

    // 出力
    println(ans)
}