class ArrayOperations(val numbers: IntArray) {
    fun sumOfPositiveElements(): Int {
        return numbers.filter { it > 0 }.sum()
    }

    fun productOfElements(): Int {
        return numbers.reduce { acc, i -> acc * i }
    }

    fun average(): Double {
        return numbers.average()
    }
}



fun main() {
    val myArray = ArrayOperations(intArrayOf(2, -3, 5, 0, 1))
    println("Сумма положительных элементов: ${myArray.sumOfPositiveElements()}")
    println("Произведение элементов: ${myArray.productOfElements()}")
    println("Среднее арифметическое: ${myArray.average()}")
}