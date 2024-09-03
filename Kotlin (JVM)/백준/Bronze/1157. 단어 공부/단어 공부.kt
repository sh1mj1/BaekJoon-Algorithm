val input = readln().groupingBy(Char::lowercaseChar).eachCount()

fun main() {
    val map = input.toList().sortedBy { it.second }
    val size = map.size
    
    val max = map[size-1].second
    if(size == 1) {
        println(map[size-1].first.uppercaseChar())
        return
    }
    
    val secondMax = map[size-2].second
    if(max > secondMax) {
        println(map[size-1].first.uppercaseChar())
        return
    }
    println("?")
    
}