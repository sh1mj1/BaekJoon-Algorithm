import kotlin.math.*

fun main() {
    var maxNum = 0
    var maxIdx = 0
    for (idx in 1 .. 9) {
        val num = readln().toInt()
        maxNum = max(num, maxNum)
        if (num == maxNum) {
            maxIdx = idx
        }
    }
    println(maxNum)
    println(maxIdx)
}