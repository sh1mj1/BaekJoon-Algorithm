fun main() {
    val count = readln().toInt()
    val words = mutableListOf<String>()

    repeat(count) {
        words.add(readln())
    }

    val standardWord = words[0]
    val standardMap = standardWord.groupingBy { it }.eachCount()
    var similarWordsCount = 0

    for (i in 1 until count) {
        val compareWord = words[i]
        val compareMap = compareWord.groupingBy { it }.eachCount()

        var difference = 0
        val allKeys = (standardMap.keys + compareMap.keys).distinct()

        for (key in allKeys) {
            val freq1 = standardMap[key] ?: 0
            val freq2 = compareMap[key] ?: 0
            difference += kotlin.math.abs(freq1 - freq2)
        }
        val lengthDifference = kotlin.math.abs(standardWord.length - compareWord.length)


        if ((difference == 0) || 
            (difference == 2 && lengthDifference == 0) || 
            (difference == 1 && lengthDifference == 1)) {
            similarWordsCount++
        }
    }

    println(similarWordsCount)
}
