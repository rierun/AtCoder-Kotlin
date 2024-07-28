@kotlin.ExperimentalStdlibApi
fun main() {

    // 入力
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    data class Test(val c: Int, val a: List<Int>, val r: Boolean)

    val test = List(m) {
        val t = readln().split(" ")
        val c = t[0].toInt()
        val a = t.subList(1, c + 1)
        // 最後がoならtrue そうでないならfalse
        val r = t[t.size - 1] == "o"
        Test(c, a.map { it.toInt() }, r)
    }

    // 処理
    var res = 0
    for (i in 0 until (1 shl n)) {
        var gd = true

        for (j in 0 until m) {
            var cnt = 0
            for (l in 0 until test[j].c) {
                if ((i shr (test[j].a[l] - 1)) and 1 == 1) {
                    cnt++
                }
            }
            if (cnt < k && test[j].r) gd = false
            if (cnt >= k && !test[j].r) gd = false
        }

        if (gd) res++
    }

    // 出力
    println(res)
}