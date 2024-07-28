import kotlin.math.cos
import kotlin.math.sin

@kotlin.ExperimentalStdlibApi
fun main() {
    // 事前準備 (答えや関数等)
    var ans = ""

    // 入力
    val (a, b, d) = readln().split(" ").map { it.toInt() }

    // 処理
    // ラジアンに
    val fxD = Math.toRadians(d.toDouble())

    val dSin = sin(fxD)
    val dCos = cos(fxD)
    ans = "${(dCos * a - dSin * b)} ${(dSin * a + dCos * b)}"

    // 出力
    println(ans)
}