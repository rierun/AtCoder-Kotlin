import kotlin.math.abs

@kotlin.ExperimentalStdlibApi
fun main() {
    // DP法
    val (sx, sy) = readln().split(" ").map(String::toLong)
    val (tx, ty) = readln().split(" ").map(String::toLong)


    // 処理
    // 上方向の支払い
    val by = abs(sy - ty)
    var bx = 0L
    // 横方向へ移動する際支払った数

    // 移動しなくてはならないx方向
    val xa = tx - sx
    val xhou = if (xa < 0) "l" else if (xa == 0L) "f" else "r"

    var fx = by
    val yp = sy % 2 == 0L
    if (xhou == "l") {
        val tax = sx - 1
        if (tax % 2 == 0L && yp || tax % 2 != 0L && !yp) fx++
    } else if (xhou == "r") {
        val tax = sx + 1
        if (tax % 2 != 0L && yp || tax % 2 == 0L && !yp) fx++
    }

    if (xa > fx) {
        bx = xa - fx
    }


    println(by + bx)
}

//    // 最初の位置はさいたんけいろ b WA
//    var nx = sx
//    var ny = sy
//    val yhou = if (ty - ny < 0) "b" else "t"
//
//    for (i in 0..by) {
//        //最短経路への横方向の方角
//        val xhou = if (tx - nx < 0) "l" else if (tx - nx == 0L) "f" else  "r"
//        // y方向のパターンを確認
//        val yp = ny % 2 == 0L
//
//        if (xhou == "l") {
//            val tax = nx - 1
//            if (tax % 2 != 0L && yp || tax % 2 == 0L && !yp) {
//                bx++
//            }
//            nx = tax
//        }
//        if (xhou == "r") {
//            val tax = nx + 1
//            if (tax % 2 == 0L && yp || tax % 2 != 0L && !yp) {
//                bx++
//            }
//            nx = tax
//        } else  {
//            break
//        }
//        if (yhou == "t") ny++ else ny--
//    }