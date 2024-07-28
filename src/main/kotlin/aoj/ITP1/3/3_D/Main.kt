@kotlin.ExperimentalStdlibApi
fun main() {
    var ans = 0
    // 入力
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    // 処理
    for (i in a..b) {
        if (c % i == 0) {
            ans++
        }
    }


    // 出力
    println(ans)
}