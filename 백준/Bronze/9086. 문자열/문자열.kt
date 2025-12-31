fun main() {
    val t = readln().toInt()
    repeat(t) {
        val str = readln()
        print(str.first())
        print(str.last())
        println()
    }
}