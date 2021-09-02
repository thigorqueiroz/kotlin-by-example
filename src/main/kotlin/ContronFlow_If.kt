//it's not possible to use ternary in kotlin, but 'if' can be an expression
fun max (a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(1, 3))
}
