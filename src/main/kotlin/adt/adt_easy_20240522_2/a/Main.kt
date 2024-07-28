@kotlin.ExperimentalStdlibApi
fun main() {
    val a = readln().split(" ")
    val b = a.sorted()
    val k = if (a != b) "No" else "Yes"



    println(k)
}