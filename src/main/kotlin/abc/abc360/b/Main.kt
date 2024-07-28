@kotlin.ExperimentalStdlibApi
fun main() {
    val (s, t) = readln().split(" ")

    // 処理
    for (i in 1 until s.length) {
        for (j in 0 until i) {
            var s1 = ""
            for (k in j until s.length step i) {
                s1 += s[k]
            }

            if (t == s1) {
                println("Yes")
                return
            }
        }
    }


    println("No")
}