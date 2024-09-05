val N = readln().toInt()
var rest = N

enum class Turn{
    SK,
    CY
}

fun nextTurn(turn: Turn): Turn = when(turn) {
    Turn.SK -> Turn.CY
    Turn.CY -> Turn.SK
}

fun takeTurn(count: Int, turn: Turn): Turn {
    if(count == 1) {
        rest--
        return turn
    }
    if(count == 3){
        rest -= 3
        return turn
    }
    
    if(count > 3) {
        rest -= 3
        return takeTurn(rest, nextTurn(turn))
    }
    rest--
    return takeTurn(rest, nextTurn(turn))
}

fun main() {
    val winner = takeTurn(N, Turn.SK)
    println(winner.name)
}

