import java.util.*

fun main() {
    System.`in`.bufferedReader().use { br -> 
        val st = StringTokenizer(br.readLine())
        var sum = 0
        while (st.hasMoreTokens()) {
            val num = st.nextToken().toInt()
            sum = sum + num * num
        }
        val ans = sum % 10
        System.`out`.bufferedWriter().use { bw -> 
            bw.write(ans.toString())
            bw.flush()
        }
    }
}