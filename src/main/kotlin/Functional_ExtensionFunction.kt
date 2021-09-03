data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)


// THIS ?: IS  'elvis operator'

fun Order.maxPricedItemValue():Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

fun Order.minPricedItemValue() = this.items.minByOrNull { it.price }?.price ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames get() = items.map { it.name }.joinToString()

val Item.formattedPrice get() = "price : ${this.price}" //only GET and SETTER are permitted

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    val emptyOrder = Order(listOf())
    println("Max priced item name : ${order.maxPricedItemName()}")
    println("Max priced item value : ${order.maxPricedItemValue()}")
    println("Min priced value: ${emptyOrder.minPricedItemValue()}")


    println(order.items.last().formattedPrice)
    println("Items: ${order.commaDelimitedItemNames}")

}