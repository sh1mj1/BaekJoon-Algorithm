val dp = IntArray(10_001) { 0 }

val T = readln().toInt()
val nList = mutableListOf<Int>()

fun main() {
    var maxN = 0
    
    for(i in 0 .. 5) {
        dp[i] = i
    }
    
    repeat(T) {
        val n = readln().toInt()
        nList.add(n)
        maxN = kotlin.math.max(n, maxN)
    }
    
    for(i in 6 .. maxN) {        
        dp[i] = dp[i-1] + countWays(i)
    }
    for(n in nList) {
        println(dp[n])
    }

}

fun countWays(x: Int): Int {
    var count = 0
    
    // b는 0부터 x // 3 까지 반복
    for (b in 0 .. (x / 3)) {
        val a2 = x - 3 * b
        if (a2 % 2 == 0) {
            val a = a2 / 2
            if (a >= 0) {
                count++
            }
        }
    }
    
    return count
}

