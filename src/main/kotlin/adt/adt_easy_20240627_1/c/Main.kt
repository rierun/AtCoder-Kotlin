@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val p = readln().split(" ").map(String::toInt)

    // 処理
    var cnt = 0
    var nowp = n
    while (nowp > 1) {
        cnt++
        nowp=p[nowp-2]
    }


    println(cnt)
}