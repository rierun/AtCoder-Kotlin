@kotlin.ExperimentalStdlibApi
fun main() {
    val x = readln()
    val s = x.count { it == 'a' }
    var sa = 0
    var k = 0
    for (i in x) {
        if (sa == s) {
            break
        }
        if (i == 'a') {
            sa++
        }
        k++
    }

    if (k == 0) k= -1

    println(k)
}