// data class Command(val direction: Direction, val steps: Int) {
// enum class Direction { UP, DOWN, LEFT, RIGHT }
// }
//
// data class Ufo(var x: Int, var y: Int) {
// fun move(command: Command) {
// when (command.direction) {
// Command.Direction.UP -> y += command.steps
// Command.Direction.DOWN -> y -= command.steps
// Command.Direction.LEFT -> x -= command.steps
// Command.Direction.RIGHT -> x += command.steps
// }
// println("Тарелка Рика сместилась ${command.direction.name.toLowerCase()} на ${command.steps}")
// }
//
// override fun toString(): String {
// return "Текущее положение летающей тарелки: ($x, $y)"
// }
// }
//
// fun messageParse(encryptedMessage: String, ufo: Ufo) {
// encryptedMessage.forEach { char ->
// val command = when (char.toUpperCase()) {
// 'A' -> Command(Command.Direction.LEFT, 2)
// 'B' -> Command(Command.Direction.RIGHT, 1)
// 'W' -> Command(Command.Direction.UP, 1)
// 'S' -> Command(Command.Direction.DOWN, 1)
// else -> null
// }
// command?.let { ufo.move(it) }
// }
// }
//
// fun main() {
// val ufo = Ufo(0, 0)
// val encryptedMessage = "aBWS" // Пример зашифрованного сообщения
//
// messageParse(encryptedMessage, ufo)
// println(ufo)