@ExperimentalStdlibApi
class Main {
    fun main() {
        Solve().run()
    }
}

class Solve {
    // 入力関数
    // fun readln(): String = readLine()!!
    fun readInt() = readln().toInt()
    fun readLong() = readln().toLong()
    fun readFloat() = readln().toFloat()
    fun readDouble() = readln().toDouble()

    fun readList() = readln().split(" ")
    fun readIntList() = readList().map { it.toInt() }
    fun readLongList() = readList().map { it.toLong() }
    fun readFloatList() = readList().map { it.toFloat() }
    fun readDoubleList() = readList().map { it.toDouble() }

    fun readLines(num: Int?): List<String> {
        val n = num ?: readInt()

        return List(n) { readln() }
    }

    fun readIntLists(num: Int?): List<Int> = readLines(num).map { it.toInt() }
    fun readLongLists(num: Int?): List<Long> = readLines(num).map { it.toLong() }
    fun readFloatLists(num: Int?): List<Float> = readLines(num).map { it.toFloat() }
    fun readDoubleLists(num: Int?): List<Double> = readLines(num).map { it.toDouble() }

    var ans: String = ""

    fun run() {

    }

}