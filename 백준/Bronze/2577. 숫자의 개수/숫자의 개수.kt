fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    
    val str = (a * b * c).toString()
    val count = MutableList<Int>(10) { 0 }
    
    str.forEach { char ->
        count[char.digitToInt()]++
    }
    count.forEach { dc ->
        println(dc)
    }
    
}