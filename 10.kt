fun main() {
    println("Начало Main")
    imitationTwo()
    imitationOne()
    println("Конец Main")

    println("\nМногопоточность в одном потоке:")
    Thread {
        imitationTwo()
        imitationOne()
    }.start()

    println("\nМногопоточность в разных потоках:")
    Thread {
        imitationTwo()
    }.start()
    Thread {
        imitationOne(1500)
    }.start()
}

fun imitationOne(delay: Long = 1000) {
    for (i in 1..10) {
        Thread.sleep(delay)
        println("One $i")
    }
}

fun imitationTwo() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("Two $i")
    }
}