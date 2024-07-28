@kotlin.ExperimentalStdlibApi
fun main() {
    // 入力
    val (n, a, b) = readln().split(" ").map { it.toInt() }

    // 処理
    var k = 0
    var o = 0
    readln().forEach {
        when (it) {
            'a' -> {
                if (k < a + b) {
                    println("Yes")
                    k++
                } else {
                    println("No")
                }
            }
            'b' -> {
                if (k < a + b && o < b) {
                    println("Yes")
                    k++
                    o++
                } else {
                    println("No")
                }
            }
            else -> {
                println("No")
            }
        }
    }

    // 出力
}