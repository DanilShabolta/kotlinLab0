data class Vector(val x: Double, val y: Double, val z: Double) {
    fun length(): Double {
        return Math.sqrt(x * x + y * y + z * z)
    }

    operator fun times(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }
}

fun main() {
    val vector1 = Vector(3.0, 0.5, 8.0)
    val vector2 = Vector(1.0, 2.0, 3.0)

    println("Длина вектора 1: ${vector1.length()}")
    println("Скалярное произведение: ${vector1 * vector2}")
}