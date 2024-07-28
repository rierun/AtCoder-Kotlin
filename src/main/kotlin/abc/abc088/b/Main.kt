@kotlin.ExperimentalStdlibApi
fun main() {
    readln()
    val a = readln().split(" ").map(String::toInt)

    // 処理
    val sorted = a.sorted().reversed()
    val alice = sorted.filterIndexed { index, _ -> index % 2 == 0 }.sum()
    val bob = sorted.filterIndexed { index, _ -> index % 2 == 1 }.sum()
    val ans = alice - bob


    println(ans)
}