@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = "Yes"

    val ha: MutableList<Int> = mutableListOf()
    val hb: MutableList<Int> = mutableListOf()

    // 入力
    // 行列A
    val (h1, w1) = readln().split(" ").map { it.toInt() }
    val a = List(h1) {
        val i = readln().split(" ").map { it.toInt() }
        ha += i
        i
    }
    // 行列B
    val (h2, w2) = readln().split(" ").map { it.toInt() }
    val b = List(h2) {
        val i = readln().split(" ").map { it.toInt() }
        hb += i
        i
    }


    // 出力
    println(ans)
}