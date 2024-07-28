@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map(String::toInt)

    // 処理
    // 7個づつのグループに分ける
    val aa = a.chunked(7)
    aa.forEach {
        println(it.sum())
    }
}