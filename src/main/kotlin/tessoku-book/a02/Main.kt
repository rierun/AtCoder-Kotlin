@kotlin.ExperimentalStdlibApi
fun main() {
    val (n, x) = readln().split(" ").map(String::toInt)
    val a = readln().split(" ").map(String::toInt)
    
    // 処理
    a.forEach {
        if (it == x) {
            println("Yes")
            return
        }
    }

    println("No")

}