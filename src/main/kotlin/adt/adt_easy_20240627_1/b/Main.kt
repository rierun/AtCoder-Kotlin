@kotlin.ExperimentalStdlibApi
fun main() {
    val (h, w) = readln().split(" ").map(String::toInt)
    val (r, c) = readln().split(" ").map(String::toInt)

    // 処理
    var cnt = 0
    if (c <= w) {
        if (c < w) {
            cnt++
        }
        if (c <= 1) {
            cnt--
        }
        cnt++
    }
    if (r <= h) {
        if (r < h) {
            cnt++
        }
        if (r <= 1) {
            cnt--
        }
        cnt++
    }

    println(cnt)
}