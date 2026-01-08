fun main() {
    val c = readln().toInt()
    if (c == 1) {
        print("*")
        return
    }
    repeat(c) { i ->
        val starCnt = i + 1
        print(" ".repeat(c - starCnt))
        print("*".repeat(starCnt))
        if (starCnt != c) { println() }
    }
}