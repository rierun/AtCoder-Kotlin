@kotlin.ExperimentalStdlibApi
fun main() {
    data class User(val name: String, val rate: Int)

    val n = readln().toInt()
    val u = List (n) {
        val (name, rate) = readln().split(" ")
        User(name, rate.toInt())
    }.sortedBy { it.name }
    val ans: String

    val allPoint = u.sumOf { it.rate }

    ans = u[allPoint % u.size].name

    println(ans)
}