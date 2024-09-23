// fun messageParse2(message: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
// message.forEach { char ->
// when (char.toLowerCase()) {
// 'x' -> eventX()
// 'y' -> eventY()
// 'z' -> eventZ()
// }
// }
// }
//
// fun main() {
// messageParse2("abxbbznmfkYyyхх") {
// println("Обнаружен символ x")
// }
// {
// println("Обнаружен символ y")
// } {
// println("Обнаружен символ z")
// }
// }