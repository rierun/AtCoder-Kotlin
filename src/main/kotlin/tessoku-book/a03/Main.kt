@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, k) = readln().split(" ").map(String::toInt)
    val p = readln().split(" ").map(String::toInt)
    val q = readln().split(" ").map(String::toInt)
    
    // 処理
    val a = mutableListOf<Int>()
    p.forEach {
        a += k - it
    }

    a.forEach {
        if (it in q) {
            println("Yes")
            return
        }
    }

    println("No")
}