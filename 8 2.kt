fun main() {
    val words: List<String?> = listOf("hello", null, "world", "kotlin")

    // 1. Использование оператора if
    println("Использование оператора if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        } else {
            println("empty")
        }
    }

    // 2. Использование безопасного вызова
    println("\nИспользование безопасного вызова:")
    words.forEach { word ->
        println(word?.uppercase() ?: "empty")
    }

    // 3. Использование функции let
    println("\nИспользование функции let:")
    words.forEach { word ->
        word?.let { println(it.uppercase()) } ?: println("empty")
    }
}