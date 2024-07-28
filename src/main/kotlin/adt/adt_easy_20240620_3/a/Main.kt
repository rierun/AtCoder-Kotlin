@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, x) = readln().split(" ").map(String::toInt)

    // 処理
    // アルファベットをn回つなげた文字列を作成
    val a = ('a'..'z')
    var s = ""
    a.forEach { i ->
        repeat(n) {
            s += i
        }
    }


    println(s[x - 1].uppercaseChar())
}