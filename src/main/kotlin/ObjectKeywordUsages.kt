fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    //this is a singleton
    val dayRates = object {
        val standard: Int = 30 * standardDays
        val festivity: Int = 50 * festivityDays
        val special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $total")
}

// it's not an expression and can't be used in a variable assignment
object DoAuth {
    fun takeParams(username: String, pass: String) {
        println("input Auth parameters = $username:$pass")
    }
}


class BigBen {
    //this is a companion object
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes)  print("BONG ")
        }
    }
}

fun main() {
    rentPrice(10,2,30)
    DoAuth.takeParams("@thigorqueiroz", "123")
    BigBen.getBongs(12)
}