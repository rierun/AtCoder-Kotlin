@kotlin.ExperimentalStdlibApi
fun main() {
    val (l1, r1, l2, r2) = readln().split(" ").map { it.toInt() }
    val h1 = l1 + 1..r1
    val h2 = l2 + 1..r2
    var a = 0
    for (i in h1) {
        if (i in h2) {
            a++
        }
    }

    println(a)
}