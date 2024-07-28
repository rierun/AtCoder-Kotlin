@kotlin.ExperimentalStdlibApi
fun main() {
    val t = readln().toInt()
    val n = readln().toInt()

    data class TimeStamp(val l: Int, val r: Int)

    val timeStamps = List(n) {
        val (l, r) = readln().split(" ").map(String::toInt)
        TimeStamp(l, r)
    }

    // 処理
    // 各時刻何人増加したか
    val b = MutableList(t + 1) { 0 }
    for (i in timeStamps) {
        b[i.l]++
        b[i.r]--
    }
    // 累計
    val tCum = MutableList(t + 1) { 0 }
    tCum[0] = b[0]
    for (i in 1 .. t) {
        tCum[i] = tCum[i - 1] + b[i]
    }

    for (i in 0 until t) {
        println(tCum[i])
    }
}