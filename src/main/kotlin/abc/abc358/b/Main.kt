@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, a) = readln().split(" ").map(String::toInt)
    val t = readln().split(" ").map(String::toInt)

    // 処理

    var maxTime = 0

    for (i in t) {
        if (maxTime < i) {
            maxTime += a + (i - maxTime)
        } else {
            maxTime += a
        }
        println(maxTime)
    }
}
