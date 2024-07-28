@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map(String::toInt)

    // 処理
    var cnt = 0
    for (i in 1 until 2 * n - 1) {
        val be = a[i - 1]
        val af = a[i + 1]
        if (be == af) {
            cnt++
        }
    }


    println(cnt)
}