@kotlin.ExperimentalStdlibApi
fun main() {
    while (true) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x == 0 && y == 0) {
            break
        }
        if (x < y) {
            println("$x $y")
        } else {
            println("$y $x")
        }
    }
}