class MutableStack<T> (vararg items: T) {
    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)
    fun peek(): T = elements.last()
    fun pop () : T = elements.removeAt(elements.size - 1)
    fun isEmpty() : Boolean = elements.isEmpty()
    fun size() : Int = elements.size
    override fun toString(): String = "MutableStack(${elements.joinToString()})"
}
fun <T> mutableStackOf(vararg elements: T) = MutableStack(*elements) //spread operator = *elements
fun main() {
    val stack = mutableStackOf("test", "3.14", 2.7)
    println(stack)
}