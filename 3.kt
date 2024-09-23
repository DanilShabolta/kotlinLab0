fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d.toInt() == 0 -> 1
        else -> 0
    }
}

fun rootsConstruct(a: Double, b: Double, c: Double): Pair<Double, Double>? {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> {
            val x1 = (-b + sqr(d)) / (2 * a)
            val x2 = (-b - sqr(d)) / (2 * a)
            Pair(x1, x2)
        }
        d.toInt() == 0 -> {
            val x = -b / (2 * a)
            Pair(x, x)
        }
        else -> null
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val roots = rootsConstruct(a, b, c)
    when (roots) {
        null -> println("Уравнение не имеет действительных корней")
        else -> println("Корни уравнения: ${roots.first}, ${roots.second}")
    }
}

fun main() {
    val a = 1.0
    val b = -5.0
    val c = 6.0

    quadraticRoot(a, b, c)
}