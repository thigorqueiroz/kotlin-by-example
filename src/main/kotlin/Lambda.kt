import java.util.*

fun main() {
    val upperCase : (String) -> String = {str: String -> str.uppercase(Locale.getDefault()) }
    val sum : (Int, Int) -> Int = {a, b -> a + b}

    println(upperCase("Thiago Queiroz"))
    println(sum(1, 2))
}