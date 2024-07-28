@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)
    val ans: List<Int>

    // 入力
    readln().toInt()
    val a = readStrings().map { it.toInt() }

    // 処理
    ans = a.reversed()

    // 出力
    println(ans.joinToString(" "))
}