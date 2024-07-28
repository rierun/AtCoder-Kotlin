@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = 0

    // 入力
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }

    // 処理
    val baket = mutableListOf<Int>()
    for (i in a) {
        if (i !in baket) {
            baket += i
        }
    }
    ans = baket.size

    // 出力
    println(ans)
}