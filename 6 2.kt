interface Figure2 {
    fun calculateArea(): Double
    fun calculatePerimeter(): Double
}

class Square2(val side: Double) : Figure2 {
    override fun calculateArea(): Double {
        return side * side
    }

    override fun calculatePerimeter(): Double {
        return 4 * side
    }}

class Circle2(val radius: Double) : Figure2{
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Triangle2(val sideA: Double, val sideB: Double, val sideC: Double) : Figure2{
    override fun calculateArea(): Double {
        // Формула Герона
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }
}

fun main() {
    val square = Square2(5.0)
    val circle = Circle2(3.0)
    val triangle = Triangle2(3.0, 4.0, 5.0)

    println("Площадь квадрата: ${square.calculateArea()}")
    println("Периметр квадрата: ${square.calculatePerimeter()}")
    println("Площадь круга: ${circle.calculateArea()}")
    println("Периметр круга: ${circle.calculatePerimeter()}")
    println("Площадь треугольника: ${triangle.calculateArea()}")
    println("Периметр треугольника: ${triangle.calculatePerimeter()}")
}