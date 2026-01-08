fun main() {
    System.`in`.bufferedReader().use { br ->
        System.`out`.bufferedWriter().use { bw ->
            val c = br.readLine().toInt()
            repeat(c) { i ->
                val starCount = i + 1
                bw.write(" ".repeat(c - starCount))
                bw.write("*".repeat(starCount))
                bw.newLine()
            }
            bw.flush()
        }
    }
}