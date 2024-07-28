@kotlin.ExperimentalStdlibApi
fun main() {
    val ans: String
    // 入力
    val r = readLine()!!.toDouble()


    // 処理
    val area = r * r * Math.PI
    val circumference = 2 * r * Math.PI
    ans = "%.6f %.6f".format(area, circumference)

    // 出力
    println(ans)
}