fun main() {
    val numbers = (1..7).toList()
    val string = numbers.joinToString("+")
    println(string) // Вывод: 1+2+3+4+5+6+7
}