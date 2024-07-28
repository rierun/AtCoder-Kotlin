@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 処理
    while (true) {
        val (n, x) = readStrings().map { it.toInt() }
        if (n == 0 && x == 0) break
        var ans = 0

        for (i in 1..n) {
            val a = x - i
            for (j in i+1..a) {
                val b = a - j
                if (b in (j + 1)..n) {
                    ans++
                }
            }
        }

        println(ans)
    }
}