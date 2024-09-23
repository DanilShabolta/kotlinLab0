fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val squares = numbers.map { it * it }
    println(squares) // Вывод: [1, 4, 9, 16, 25, 36, 49]
}