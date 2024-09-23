fun main() {
    val concat: (String, String, String) -> String = { str1, str2, str3 ->
        listOf(str1, str2, str3).sortedBy { it.length }.joinToString()
    }
    val result = concat("кот", "слон", "мышь")
    println(result)
}