@kotlin.ExperimentalStdlibApi
fun main() {
    val (b, g) = readln().split(" ").map(String::toInt)

    // 処理
    if (b > g) {
        println("Bat")
    } else {
        println("Glove")
    }
}