@kotlin.ExperimentalStdlibApi
fun main() {
    fun near(a: Int, b: Int): Boolean {
        if (a > b) {
            return near(b, a)
        }
        return b - a == 1 || b - a == 4
    }

    fun sjifva(a: Char): Int {
        when (a) {
            'A' -> return 1
            'B' -> return 2
            'C' -> return 3
            'D' -> return 4
            'E' -> return 5
        }
        return -1
    }

    val (s1, s2) = readln().toCharArray().map { sjifva(it) }
    val (t1, t2) = readln().toCharArray().map { sjifva(it) }
    if (s1 == t1 && s2 == t2) {
        println("Yes")
        return
    }
    var k = "No"
    val a = near(s1, s2)
    val b = near(t1, t2)
    if (a == b) {
        k = "Yes"
    }

    println(k)
}

