import kotlin.math.max

@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map(String::toInt)
    val w = readln().split(" ").map(String::toInt)

    // 処理
    val s = MutableList(n + 1) { 0 }

    for (i in 0 until n) {
        val ni = a[i]
        val wi = w[i]
        s[ni] = max(s[ni], wi)
    }

    val ans = w.sum() - s.sum()


    println(ans)
}