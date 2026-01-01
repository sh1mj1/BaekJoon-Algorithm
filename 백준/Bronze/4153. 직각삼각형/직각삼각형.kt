fun main() {
    while (true) {
        val nums = readln().split(" ").map { it.toInt() }
        if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) break
        val sorted = nums.sortedByDescending { it }
        if (
            sorted[0] * sorted[0] == sorted[1] * sorted[1] + sorted[2] * sorted[2]
        ) {
            println("right")
            continue
        }
        println("wrong")
    }
}