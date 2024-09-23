fun main(){
    val testArray = intArrayOf(12, 5, 2, 8, 50, 4)

    println("Используя while: ${findProductMinAndMaxWhile(testArray)}")
    println("Используя reduce: ${findProductMinAndMaxReduce(testArray)}")
    println("Используя forEach: ${findProductMinAndMaxForEach(testArray)}")
    println("Используя for: ${findProductMinAndMaxFor(testArray)}")
    println("Используя min() max(): ${findProductMinAndMaxMinMax(testArray)}")
}

fun findProductMinAndMaxWhile(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var index = 0
    while (index < array.size) {
        product *= array[index]
        min = minOf(min, array[index])
        max = maxOf(max, array[index])
        index++
    }
    return Triple(product, min, max)
}

fun findProductMinAndMaxReduce(array: IntArray): Triple<Int, Int, Int> {
    val product = array.reduce { acc, i -> acc * i }
    val min = array.minOrNull() ?: 0
    val max = array.maxOrNull() ?: 0
    return Triple(product, min, max)
}

fun findProductMinAndMaxForEach(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    array.forEach {
        product *= it
        min = minOf(min, it)
        max = maxOf(max, it)
    }
    return Triple(product, min, max)
}

fun findProductMinAndMaxFor(array: IntArray): Triple<Int, Int, Int> {
    var product = 1
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (element in array) {
        product *= element
        min = minOf(min, element)
        max = maxOf(max, element)
    }
    return Triple(product, min, max)
}

fun findProductMinAndMaxMinMax(array: IntArray): Triple<Int, Int, Int> {
    val product = array.reduce { acc, i -> acc * i }
    val min = array.min()
    val max = array.max()
    return Triple(product, min, max)
}