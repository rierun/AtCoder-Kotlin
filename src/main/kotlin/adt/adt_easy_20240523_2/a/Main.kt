@kotlin.ExperimentalStdlibApi
fun main() {
    val (a,b,c,d) = readln().split(" ").map { it.toInt() }
    val k = if (a < c) {
        "Takahashi"
    } else if (a == c) {
        if (b < d || b == d) {
            "Takahashi"
        } else {
            "Aoki"
        }
    } else {
        "Aoki"
    }


    println(k)
}