fun calculate(a: Int, b:Int, operation: (Int, Int) -> Int) :Int {
    return operation(a, b)
}
fun sumThese(a: Int, b:Int) = a + b

fun operation() : (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * 2

fun main() {
    val sum = calculate(4, 5, ::sumThese)
    val multiplication = calculate(4, 6) { a, b -> a * b }
    println("sum>> $sum , multi>> $multiplication")
    println("Square of 2 >> ${operation()(2)}")
}
