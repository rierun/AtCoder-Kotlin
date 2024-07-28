@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val s = List (n) {
        readln()
    }

    // 処理
    var cnt = 0
    for (i in s) {
        if (i == "Takahashi") {
            cnt++
        }
    }


    println(cnt)
}