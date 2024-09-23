import kotlin.math.sqrt

fun main() {
    println("Введите количество простых чисел:")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        if (isPrime(number)) {
            println("${count + 1}-ое число: $number")
            count++
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
