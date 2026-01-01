import java.util.*

fun main() {
    System.`out`.bufferedWriter().use { bw ->
        System.`in`.bufferedReader().use { br ->
            while (true) {
                val st = StringTokenizer(br.readLine())
            
                val a = st.nextToken().toInt()
                val b = st.nextToken().toInt()
                val c = st.nextToken().toInt()

                if (a == 0) break

                if (a > b && a > c ) {
                    if (a * a == b * b + c * c) {
                        bw.write("right\n")
                        continue
                    }
                }

                if (b > a && b > c) {
                    if (b * b == a * a + c * c) {
                        bw.write("right\n")
                        continue
                    }
                }

                if (c > a && c > b) {
                    if (c * c == a * a + b * b) {
                        bw.write("right\n")
                        continue
                    }
                }
                bw.write("wrong\n")
            }
        }
        bw.flush()
    }
}
