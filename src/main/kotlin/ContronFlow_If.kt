//it's not possible to use ternary in kotlin, but 'if' can be an expression
fun max (a: Int, b: Int) = if (a > b) a else b


infix fun IntRange.has(value: Int): Boolean = value in this

fun main() {
    println(max(1, 3))
    print("has 5 in 1 .. 10 :::  ${1..10 has 5}")
    println()

    if (5 in 1..20) {
        print("5 in 1 .. 20")
    }
}
