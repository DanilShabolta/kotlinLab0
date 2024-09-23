fun main() {
    var sum = 0
    var count = 0
    var number: Int

    do {
        print("Введите число (0 для завершения): ")
        number = readln().toInt()
        if (number != 0) {
            sum += number
            count++
        }
    } while (number != 0)

    println("Количество введенных чисел: $count")
    println("Сумма чисел: $sum")
    if (count > 0) {
        println("Среднее арифметическое: ${sum.toDouble() / count}")
    } else {
        println("Среднее арифметическое не определено (деление на ноль)")
    }
}
