var ans = 0

val NK = readln().split(" ").map { it.toInt() }
val N = NK[0]
val K = NK[1]

val allNumSeq = readln().split(" ").map { it.toInt() }

val arr = IntArray(100_001) { 0 }

fun main() {
    var sp = 0
    var ep = 0
    while(sp < N) {
        val spNum = allNumSeq[sp]
        val epNum = allNumSeq[ep]
        if(arr[spNum] < K) {
            sp++
            arr[spNum]++
        } else {
            ep++
            arr[epNum]--
        }
        ans = kotlin.math.max(ans, sp - ep)
    }
    println(ans)
}
