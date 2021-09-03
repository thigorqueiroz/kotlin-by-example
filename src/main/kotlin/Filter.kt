fun main() {
    println("positive numbers: ${listOf(-1, -2, 1, 2).filter(::positive)}")
}

fun positive(i: Int) = i > 0


