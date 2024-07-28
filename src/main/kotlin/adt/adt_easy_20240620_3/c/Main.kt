@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()

    // 処理
    for (i in 1..n) {
        val a = mutableListOf<Int>()
        for (j in 0..i + 1) {
            if (i == j || j == 0) {
                a.add(1)
            } else {
                a.add(a[i - 1] + a[j])
            }
        }
        println(a.joinToString(" "))
    }
}