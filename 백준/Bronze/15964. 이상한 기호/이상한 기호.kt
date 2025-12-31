
fun main() {
    val nums = readln().split(" ").map { it.toLong() }
    val (a, b) = nums[0] to nums[1]
    
    val ans = (a + b) * (a - b)
    println(ans.toString())
}