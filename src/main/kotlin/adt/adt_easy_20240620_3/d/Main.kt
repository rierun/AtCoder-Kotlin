@kotlin.ExperimentalStdlibApi
fun main() {
    // 無向グラフの時間だあ
    val n = readln().toInt()
    val aa = MutableList(n + 1) { mutableListOf<Int>() }

    repeat(n - 1) {
        val (a, b) = readln().split(" ").map(String::toInt)
        aa[a] += b
        aa[b] += a
    }

    // 処理
    for (i in 1..n) {
        if (aa[i].size == n - 1) {
            println("Yes")
            return
        }
    }

    println("No")
}