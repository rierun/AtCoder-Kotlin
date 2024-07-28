@kotlin.ExperimentalStdlibApi
fun main() {
    val d = readln().toInt()
    val n = readln().toInt()

    data class Participant(val l: Int, val r: Int)

    // 処理
    val participants = List(n) {
        val (l, r) = readln().split(" ").map(String::toInt)
        Participant(l, r)
    }

    // ある日の増加人数
    val b = MutableList(d + 2) { 0 }
    for (i in participants) {
        b[i.l]++
        b[i.r + 1]--
    }

    // ある日の増加人数の累積和
    val dCum = MutableList(d + 2) { 0 }
    for (i in 1..d) {
        dCum[i] = dCum[i - 1] + b[i]
        println(dCum[i])
    }

}