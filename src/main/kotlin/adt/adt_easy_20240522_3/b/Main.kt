@kotlin.ExperimentalStdlibApi
fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    var k = "No"

    if (a % 3 == 0) {
        k = "No"
        println(k)
        return
    }

    if (a + 1 == b) {
        k = "Yes"
    }


    println(k)
}   