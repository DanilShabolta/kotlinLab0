data class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Текущие координаты: ($x, $y)"
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> point.y++
            Command.DOWN -> point.y--
            Command.LEFT -> point.x--
            Command.RIGHT -> point.x++
        }
        println("Произведено перемещение по оси X на ${point.x}, по оси Y на ${point.y}")
    }
}

fun main() {
    val point = Point(0, 0)
    val turtle = Turtle()

    turtle.move(point, Command.RIGHT)
    println(point)
    turtle.move(point, Command.UP)
    println(point)
}