@kotlin.ExperimentalStdlibApi
fun main() {
    // 入力
    val n = readln().toInt()
    val x = readln().split(" ").map { it.toInt() }

    // 処理
    val a: MutableList<Int> = mutableListOf()
    for (i in x.min()..x.max()) {
        val sum = x.sumOf { (it - i) * (it - i) }
        a.add(sum)
    }

    // 出力
    println(a.min())
}