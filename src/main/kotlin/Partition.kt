fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    println("even odd : ${numbers.partition { it % 2 == 0 }}")
}