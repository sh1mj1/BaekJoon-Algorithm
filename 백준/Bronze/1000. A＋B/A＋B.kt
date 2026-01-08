fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val (a, b) = input[0] to input[1]
    println(a + b)
}