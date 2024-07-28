import kotlin.math.sqrt

@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()

    data class Point(val x: Int, val y: Int)

    val points = List(n) {
        val (x, y) = readln().split(" ").map(String::toInt)
        Point(x, y)
    }

    // 処理
    var a = 0.0
    for (i in points) {
        for (j in points) {
            val ax = i.x - j.x
            val ay = i.y - j.y
            val c = sqrt((ax * ax + ay * ay).toDouble())
            if (c > a) {
                a = c
            }
        }
    }


    println(a)
}