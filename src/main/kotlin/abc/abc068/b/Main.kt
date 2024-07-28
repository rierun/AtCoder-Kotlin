@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()

    // 処理
    val rage = 1..n
    var max = 0
    var ans = 0
    for (i in rage) {
        if (i % 2 == 0) {
            var count = 0
            var num = i
            while (num % 2 == 0) {
                num /= 2
                count++
            }
            if (count > max) {
                max = count
                ans = i
            }
        }
    }


    println(ans)
}