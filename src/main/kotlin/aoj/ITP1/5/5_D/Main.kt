@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!

    // 事前準備 (答えや関数等)
    var ans = ""

    // 入力
    val n = readln().toInt()

    // 処理
    for (i in 1..n) {
        var x = i
        if (x % 3 == 0) {
            ans += " $i"
            continue
        }
        while (x != 0) {
            if (x % 10 == 3) {
                ans += " $i"
                break
            }
            x /= 10
        }
    }

    // 出力
    println(ans)
}