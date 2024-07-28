@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)
    var ans: String

    while (true) {
        val (m, f, r) = readStrings().map { it.toInt() }
        if (m == -1 && f == -1 && r == -1) {
            break
        }

        val sum = m + f

        if (m == -1 || f == -1) {
            ans = "F"
            println(ans)
            continue
        }
        ans = when (sum) {
            in 80..100 -> "A"
            in 65..79 -> "B"
            in 50..64 -> "C"
            in 30..49 -> {
                if (r >= 50) {
                    "C"
                } else {
                    "D"
                }
            }
            else -> "F"
        }
        println(ans)
    }
}