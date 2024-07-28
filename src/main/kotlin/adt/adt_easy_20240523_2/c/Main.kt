@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    val s = mutableListOf<Int>()
    val t = mutableListOf<Int>()
    repeat(n - 1) {
        val (sa, ta) = readln().split(" ").map { it.toInt() }
        s += sa
        t += ta
    }

    repeat(n - 1) {
        a[it+1] += a[it] / s[it] * t[it]
    }


    val k = a[n - 1]


    println(k)
}   