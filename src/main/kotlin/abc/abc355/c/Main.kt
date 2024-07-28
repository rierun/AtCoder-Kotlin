@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, t) = readln().split(" ").map { it.toInt() }
    var ans = 0
    var tur = 0
    val out = mutableListOf<Int>()
    out += 1..n
    out += 1+n*(n-1)..n*n
    for (i in 2 until n) {
        out += 1+n*(i-1)
        out += n*i
    }

    val b = mutableListOf<Int>()
        val a = run { readln().split(" ").forEach {
            tur++
            b.add(it.toInt())

            if (tur in out) {
                repeat(n) {

                }
            }
        }
    }


    println(ans)
}