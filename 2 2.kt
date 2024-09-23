fun main() {
    val numbers = intArrayOf(1, 5, 3, 8, 2, 7)
    findLocalMaximaFor(numbers)
}

fun findLocalMaximaFor(numbers: IntArray) {
    for (i in 1 until numbers.size - 1) {
        if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            println(numbers[i])
        }
    }
}

fun findLocalMaximaWhile(numbers: IntArray) {
    var i = 1
    while (i < numbers.size - 1) {
        if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            println(numbers[i])
        }
        i++
    }
}

fun findLocalMaximaForEach(numbers: IntArray) {
    numbers.indices.drop(1).dropLast(1).forEach { i ->
        if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            println(numbers[i])
        }
    }
}