@kotlin.ExperimentalStdlibApi
fun main() {
    // aoj向けのテンプレート
    val render = System.`in`.bufferedReader()
    fun readln(): String = render.readLine()
    fun readStrings() = readln().split(" ")

    // 事前準備 (答えや関数等)

    // 入力
    val n = readln().toInt()

    val s = mutableListOf<Int>()
    val h = mutableListOf<Int>()
    val c = mutableListOf<Int>()
    val d = mutableListOf<Int>()

    repeat(n) {
        val (e, num) = readStrings()
        val numInt = num.toInt()
        when (e) {
            "S" -> s.add(numInt)
            "H" -> h.add(numInt)
            "C" -> c.add(numInt)
            "D" -> d.add(numInt)
        }
    }
    render.close()

    // 処理
    val ms = mutableListOf<Int>()
    val mh = mutableListOf<Int>()
    val mc = mutableListOf<Int>()
    val md = mutableListOf<Int>()

    for (i in 1..13) {
        if (!s.contains(i)) ms.add(i)
        if (!h.contains(i)) mh.add(i)
        if (!c.contains(i)) mc.add(i)
        if (!d.contains(i)) md.add(i)
    }

    // 出力
    for (i in 1..ms.size + mh.size + mc.size + md.size) {
        when {
            i <= ms.size -> println("S ${ms[i - 1]}")
            i <= ms.size + mh.size -> println("H ${mh[i - ms.size - 1]}")
            i <= ms.size + mh.size + mc.size -> println("C ${mc[i - ms.size - mh.size - 1]}")
            i <= ms.size + mh.size + mc.size + md.size -> println("D ${md[i - ms.size - mh.size - mc.size - 1]}")
        }
    }
}