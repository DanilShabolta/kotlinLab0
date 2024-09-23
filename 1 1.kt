fun main() {
    print("Введите целое положительное число: ")
    val number = readln().toInt()

    // 1-й способ: с помощью математических операций
    val lastDigit = number % 10
    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }
    println("Сумма первой и последней цифры (1-й способ): ${firstDigit + lastDigit}")

    // 2-й способ: с помощью строковых функций
    val firstDigitStr = number.toString().first()
    val lastDigitStr = number.toString().last()
    println("Сумма первой и последней цифры (2-й способ): ${firstDigitStr.digitToInt() + lastDigitStr.digitToInt()}")
}
