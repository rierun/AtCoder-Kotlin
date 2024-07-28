@kotlin.ExperimentalStdlibApi
fun main() {
    data class Interval(val l: Int, val r: Int, val i: IntRange)

    val n = readln().toInt()
    val i = List (n) {
        val (l, r) = readln().split(" ").map { it.toInt() }
        Interval(l, r, l..r)
    }

    var ans = 0

    for (l in 0..i.maxOf { it.r }) {
        val c = i.count { l in it.i }
        println(c)
        ans = maxOf(ans, c)

    }

    println(ans)
}   