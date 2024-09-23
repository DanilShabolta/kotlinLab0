fun main() {
    val randomNumber = (0..10).random()
    var guess: Int

    do {
        print("Угадайте число от 0 до 10: ")
        guess = readln().toInt()

        if (guess > randomNumber) {
            println("Много")
        } else if (guess < randomNumber) {
            println("Мало")
        } else {
            println("Угадал!")
        }
    } while (guess != randomNumber)
}
