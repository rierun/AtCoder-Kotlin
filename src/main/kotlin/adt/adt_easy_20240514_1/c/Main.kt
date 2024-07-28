@kotlin.ExperimentalStdlibApi
fun main() {
    val s = readln()
    val t = readln()
    val ans = "No"

    if (s == t) return println("Yes")

    val k = t[0] - s[0]

    val s1 = s.map { 'a' + ((it + k - 'a' + 26) % 26) }.joinToString("")
    if (s1 == t) return println("Yes")

    println(ans)
}   