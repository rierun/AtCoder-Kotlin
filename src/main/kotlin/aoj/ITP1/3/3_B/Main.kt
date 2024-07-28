@kotlin.ExperimentalStdlibApi
fun main() {
    var now = 0
    while (true) {
        now++
        val x = readln().toInt()
        if (x == 0) {
            break
        }
        println("Case $now: $x")
    }
}