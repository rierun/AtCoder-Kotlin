@kotlin.ExperimentalStdlibApi
fun main() {
    data class Card(val strong: Int, val cost: Int)

    val n = readln().toInt()
    val c = List (n) {
        val (strong, cost) = readln().split(" ")
        Card(strong.toInt(), cost.toInt())
    }

    val k = mutableListOf<Int>()

    val ans = (1..n).toMutableList()

    c.sortedBy { it.cost }
    println(c)

    c.forEachIndexed { index, card ->
        if (index == c.lastIndex || k.contains(index + 1)) {
            return@forEachIndexed
        }
        c.subList(index + 1, c.size).forEach { card2 ->
            if (card2.strong > card.strong) {
                k.add(index + 1)
                ans.remove(index + 1)
                return@forEachIndexed
            }
        }
    }

    println("""
        ${ans.size}
        ${ans.joinToString(" ")}
    """.trimIndent())
}   