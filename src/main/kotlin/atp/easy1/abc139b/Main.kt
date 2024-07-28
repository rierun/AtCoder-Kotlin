@kotlin.ExperimentalStdlibApi
fun main() {

    var ans = 0

    // 入力
    val (a, b) = readln().split(" ").map { it.toInt() }
    var k = 1

    // 処理
    while (k < b) {
        ans++
        k--
        k += a
    }

    // 出力
    println(ans)
}