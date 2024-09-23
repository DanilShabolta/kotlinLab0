fun convert(message: String, convert: (String) -> String): String {
    val result = convert(message)
    return result
}

fun main() {
    val text = "Рыбатекст: https://fishtext.ru/index.php"
    println(convert(text) { it.replace("[a-zA-Z]".toRegex(), "блин") })
}