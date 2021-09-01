fun printThis(msg: String) {
    println("message: $msg")
}

fun printMessageWithPrefix(msg: String, prefix: String = "INFO") {
    println("[$prefix] $msg")
}

fun sum(a: Int, b: Int) = a + b

fun multiply(a: Int, b:Int) :Int {
    return a * b
}

fun main() {
    val msg = "this is a message"
    printThis(msg)
    printMessageWithPrefix(msg)
    printMessageWithPrefix("The sum is : ${sum(1,2)}")
    printMessageWithPrefix(prefix = "LOG", msg = "The multiply is ${multiply(1, 4)}")
}

