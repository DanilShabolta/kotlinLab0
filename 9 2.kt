fun main() {
    val numbers = listOf(-2, 5, -1, 0, 3)
    val changedNumbers = numbers.map { if (it > 0) -it else it }
    println(changedNumbers) // Вывод: [-2, -5, -1, 0, -3]
}