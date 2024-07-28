@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, m) = readln().split(" ").map(String::toInt)

    data class PopcornShop(val pop: List<Boolean>)
    val shops = List(n) {
        val pop = readln().split("").subList(1, m + 1).map { it == "o" }
        PopcornShop(pop)
    }

    // 処理
    val a = mutableListOf<Int>()
    for (i in 0 )

    println()
}