@kotlin.ExperimentalStdlibApi
fun main() {
    val a = readln().split(" ").map(String::toInt)
    val b = readln().split(" ").map(String::toInt)

    // 処理
    val asum = a.sum()
    val bsum = b.sum()
    val ans = asum - bsum + 1


    println(ans)
}