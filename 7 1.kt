data class Car(val name: String, val speed: Int)

fun main() {
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)
    val car3 = Car("Belaz", 100)
    val vehicle1 = Car("Ural", 100)
    val vehicle2 = vehicle1.copy(name = "ZIL")
    val vehicle3 = vehicle1

    println(car1 == car2) // true (равны по содержимому)
    println(car1 === car2) // false (разные объекты)
    println(car1.hashCode() == car2.hashCode()) // true (одинаковый хэш-код)

    println(car1 == car3) // false (разные имена)

    println(vehicle1 == vehicle2) // false (разные имена)
    println(vehicle1 === vehicle3) // true (один и тот же объект)
}