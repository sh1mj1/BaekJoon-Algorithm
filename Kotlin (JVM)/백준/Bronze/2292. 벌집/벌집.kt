val target = readln().toInt()

fun main() {
    var depth = 0
    var beforeMax = 1
    
    while(true) {
        if(target <= beforeMax){
            break
        }
        depth++
        beforeMax = beforeMax + 6 * depth
    }
    
    println(depth + 1)
}