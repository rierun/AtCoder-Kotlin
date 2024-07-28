@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = -1

    // 入力
    val s = readln()

    // 処理
    when (s) {
        "Monday" -> ans = 5
        "Tuesday" -> ans = 4
        "Wednesday" -> ans = 3
        "Thursday" -> ans = 2
        "Friday" -> ans = 1
    }


    // 出力
    println(ans)
}