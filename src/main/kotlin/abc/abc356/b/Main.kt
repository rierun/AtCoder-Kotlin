@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)

    // 入力
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    val x = List (n) {
        readln().split(" ").map { it.toInt() }
    }

    // 処理
    for (i in 0 until m) {
        var sum = 0

        for (j in 0 until n) {
            sum += x[j][i]
        }

        if (sum < a[i]) {
            println("No")
            return
        }
    }


    // 出力
    println("Yes")
}