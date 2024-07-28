@kotlin.ExperimentalStdlibApi
fun main() {
    val (r, c) = readln().split(" ").map(String::toInt)
    val a = List(2) {
        readln().split(" ").map(String::toInt)
    }

    // 処理

    println(a[r - 1][c - 1])
}