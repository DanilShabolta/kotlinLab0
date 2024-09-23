fun main() {
    val timeString = "01:20:12"
    val parts = timeString.split(":")

    val hours = parts[0].toInt()
    val minutes = parts[1].toInt()
    val seconds = parts[2].toInt()

    val totalSeconds = hours * 3600 + minutes * 60 + seconds
    println("Количество секунд: $totalSeconds")
}