open class Vehicle(val speed: Double = 0.0, val name: String = "Vehicle") {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(speed: Double, name: String) : Vehicle(speed, name)
class Airplane(speed: Double, name: String) : Vehicle(speed, name)
class Tank(speed: Double, name: String) : Vehicle(speed, name)

fun main() {
    val boat = Boat(30.0, "Яхта")
    val airplane = Airplane(900.0, "Боинг")
    val tank = Tank(40.0, "Т-90")

    boat.start()
    airplane.stop()
    tank.start()
}