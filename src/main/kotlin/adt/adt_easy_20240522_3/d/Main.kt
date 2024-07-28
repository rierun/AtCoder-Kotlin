@kotlin.ExperimentalStdlibApi
fun main() {
    val s = readln().toCharArray().sorted()
    var k = "No"
    if (s.size % 2 ==0) {
        for (i in s.indices step 2) {
            if (s[i] == s[i+1] && s[i] != s[i+2]) {
                k = "Yes"
            } else {
                k = "No"
                break
            }
        }
    }

    println(k)
}   