@kotlin.ExperimentalStdlibApi
fun main() {
    val n = readln().toInt()
    val k = n.toString(2).split("1").last().count()



    println(k)
}   