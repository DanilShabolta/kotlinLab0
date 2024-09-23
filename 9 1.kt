fun main() {
    val numbers = listOf(-2, 5, -1, 0, 3)
    val negativeNumbers = numbers.filter { it < 0 }
    println(negativeNumbers) // Вывод: [-2, -1]
}