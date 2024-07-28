@kotlin.ExperimentalStdlibApi
fun main() {
    val v1 = readln().split(" ").map(String::toInt)
    val v2 = readln().split(" ").map(String::toInt)

    val (a, b, c, d, e) = v1
    val f = v1[5]
    val (g, h, i, j, k) = v2
    val l = v2[5]

    // 処理
    val x = g - a + i - c
    val y = h - b + j - d
    val z = k - e + l - f

    val size = x * y * z

    if (size > 0) {
        println("Yes")
        return
    }

    println("No")
}