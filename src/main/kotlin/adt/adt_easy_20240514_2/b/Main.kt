@kotlin.ExperimentalStdlibApi
fun main() {
    val a = readln().split(" ").map { it.toInt() }.sorted()
    var ans = "No"

    if ((a[0] == a[2] && a[3] == a[4]) || (a[0] == a[1] && a[2] == a[4])) {
        ans = "Yes"
    }

    println(ans)
}