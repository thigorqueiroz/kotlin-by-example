open class Dog {
    open fun sayHello() {
        println("wow wow")
    }
}

class Pug : Dog () {
    override fun sayHello() {
        println("wif wif")
    }
}

fun main () {
    val dog : Dog = Pug()
    dog.sayHello()
}