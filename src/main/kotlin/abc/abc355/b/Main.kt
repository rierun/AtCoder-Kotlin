@kotlin.ExperimentalStdlibApi


fun main() {
    readln()
    val a = readln().split(" ").map { it.toInt() }.sorted()
    val b = readln().split(" ").map { it.toInt() }.sorted()
    val c = (a + b).sorted()
    var ans = "No"


    for (i in 0 until c.size - 1) {
        if (c[i] in a) {
            if (c[i + 1] in a) {
                ans = "Yes"
                break
            }
        }
    }

    println(ans)
}   