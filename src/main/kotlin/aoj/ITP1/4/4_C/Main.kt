@kotlin.ExperimentalStdlibApi
fun main() {
while(true) {
    // 入力
    val (a, o, b) = readLine()!!.split(" ")

    // 処理
    val ans: String = when (o) {
        "+" -> (a.toInt() + b.toInt()).toString()
        "-" -> (a.toInt() - b.toInt()).toString()
        "*" -> (a.toInt() * b.toInt()).toString()
        "/" -> (a.toInt() / b.toInt()).toString()
        "?" -> return
        else -> ""
    }

    // 出力
    println(ans)
}
}