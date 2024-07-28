@kotlin.ExperimentalStdlibApi
fun main() {

    // 入力
    val (n, l, r) = readln().split(" ").map { it.toInt() }

    // 処理
    var a = (1..n).toMutableList()
    // lからrまでの範囲を逆順にする
    val aa = a.subList(0, l - 1) + a.subList(l - 1, r).reversed() + a.subList(r, n)

    // 出力
    println(aa.joinToString(" "))
}