fun main() {
    val c = readln().toInt()
    if (c == 1) {
        print("*")
        return
    }
    repeat(c) { i ->
        val starCnt = i + 1
        repeat(c - starCnt) { print(" ") }
        repeat(starCnt) { print("*") }
        if (starCnt != c) { println() }
    }
}