sealed class Animal(val name: String)

class Cat(name: String) : Animal(name)
class Monkey(name: String) : Animal(name)

fun whenAnimalIs(animal: Animal): String {
    return when(animal) {
        is Cat -> "Im a cat, my name is ${animal.name}"
        is Monkey -> "Im ${animal.name}"
    }
}

fun main() {
    println(whenAnimalIs(Cat("Bart")))
    println(whenAnimalIs(Monkey("Kong")))
}