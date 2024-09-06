import kotlin.system.exitProcess

fun main() {
    // 입력을 받아 공백 제거
    val nums = readLine()?.trim() ?: return
    var n = 0
    var idx = 0

    while (true) {
        n += 1
        for (s in n.toString()) {
            if (nums[idx] == s) {
                idx += 1
                if (idx >= nums.length) {
                    println(n)
                    exitProcess(0)  // 프로그램 종료
                }
            }
        }
    }
}
