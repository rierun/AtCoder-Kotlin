@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)
    fun c(n: Int, m: Int, a: List<List<Int>>, b: List<Int>): Int {
        var sum = 0
        for (i in 1..m) {
            sum += a[n - 1][i - 1] * b[i - 1]
        }
        return sum
    }

    // 入力
    val (n, m) = readStrings().map { it.toInt() }
    val a = List(n) {
        readStrings().map { it.toInt() }
    }
    val b = List(m) {
        readln().toInt()
    }

    // 処理

    // 出力
    for (i in 1..n) {
        println(c(i, m, a, b))
    }
}