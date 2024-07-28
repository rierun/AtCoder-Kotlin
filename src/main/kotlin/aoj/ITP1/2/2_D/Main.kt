@kotlin.ExperimentalStdlibApi
fun main() {
    fun isOver(a: Int, r: Int, b: Int): Boolean {
        return (a - r) >= 0 && (a + r) <= b
    }

    val (w, h, x, y, r) = readLine()!!.split(" ").map { it.toInt() }
    val k = if (isOver(x, r, w) && isOver(y, r, h)) "Yes" else "No"

    println(k)
}
