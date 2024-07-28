@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    fun readln(): String = readLine()!!
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)
    data class spreadsheet(val r: Int, val c: Int, val data: List<List<Int>>)

    // 入力
    val (r, c) = readStrings().map { it.toInt() }
    val sum1 = MutableList(c) { 0 }
    val sum2 = MutableList(r) { 0 }
    var sum3 = 0
    val s = spreadsheet(r, c, List(c) {
        val data = readStrings().map { it.toInt() }
        val sum = data.sum()
        sum1[it] = sum
        for (i in 0 until c) {
            sum2[i] += data[i]
        }
        sum3 += sum

        data
    })

    // 出力
    s.data.forEachIndexed { i, row ->
        println(row.joinToString(" ") + " " + sum1[i])
    }
    println(sum2.joinToString(" ") + " " + sum3)

}