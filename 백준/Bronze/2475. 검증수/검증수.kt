fun main() {
    val ori = readln().split(" ").map { it.toInt() }
    val ans = ori.sumOf { it * it } % 10
    println(ans)
}