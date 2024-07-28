import kotlin.math.pow

@kotlin.ExperimentalStdlibApi
fun main() {
    val h = readln().toInt()
    var k = 0
    var ans = 0

    var i = 0
    while (true) {
        k += 2.0.pow(i).toInt()
        if (h < k) {
            ans = i + 1
            break
        }
        i++
    }

    println(ans)
}   