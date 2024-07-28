@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)

    // 入力
    val s = readln()

    // 宣言
    val n = s.length
    val a = MutableList(n) { "" }

    // 処理
    for (it in 0 until n) {
        a[it] = s.substring(it..n) + s.substring(0..it - 1)
    }

    // 出力
    println(a.sorted().min())
    println(a.sorted().max())
}