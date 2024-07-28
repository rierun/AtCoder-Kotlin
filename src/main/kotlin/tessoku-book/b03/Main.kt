@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().split(" ").map(String::toInt)
    
    // 処理
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()

    n.forEach { i ->
        a += 1000 - i

        a.forEach { j ->
            b += j - i
        }
    }

    println(b)

    if (0 in b) {
        println("Yes")
    } else {
        println("No")
    }
}