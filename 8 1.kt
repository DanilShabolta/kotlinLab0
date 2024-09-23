fun main() {
    print("Введите выражение (например, 2 + 3): ")
    val input = readLine() ?: return

    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Некорректный формат ввода")
        return
    }

    val num1 = parts[0].toDoubleOrNull() ?: 0.0
    val operator = parts[1]
    val num2 = parts[2].toDoubleOrNull() ?: 0.0

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль!")
                return
            }
            num1 / num2
        }
        else -> {
            println("Некорректная операция")
            return
        }
    }

    println("Результат: $result")
}