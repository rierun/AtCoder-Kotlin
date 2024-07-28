@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map(String::toInt)

    // 処理
    val ans = (1..n).sum() * 4 - a.sum()


    println(ans)
}