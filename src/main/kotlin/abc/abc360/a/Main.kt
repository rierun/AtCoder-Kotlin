@kotlin.ExperimentalStdlibApi
fun main() {
    val s = readln()

    // 処理
    var cnt = 0
    var r = 0
    var m = 0
    for (i in s) {
        cnt++
        if (i == 'R') {
            r = cnt
        }
        if (i == 'M') {
            m = cnt
        }
    }
    if (m > r) {
        println("Yes")
    } else {
        println("No")
    }
}