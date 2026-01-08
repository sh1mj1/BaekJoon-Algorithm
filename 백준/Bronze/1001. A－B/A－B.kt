import java.util.*

fun main() {
    System.`in`.bufferedReader().use { br ->
        System.`out`.bufferedWriter().use { bw ->
            val st = StringTokenizer(br.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            
            bw.write((a - b).toString())
            bw.flush()
        }
    }
}