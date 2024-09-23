fun main() {
    val fahrenheit: (Int) -> Int = { celsius -> (celsius * 9 / 5) + 32 }
    val temperatureInCelsius = 0
    val temperatureInFahrenheit = fahrenheit(temperatureInCelsius)
    println("Температура в Фаренгейтах: $temperatureInFahrenheit")
}