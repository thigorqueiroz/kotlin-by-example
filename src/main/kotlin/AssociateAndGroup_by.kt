data class Employee(val name: String, val city: String, val phone: String)

fun main() {
    val people = listOf(
        Employee("Queiroz", "Recife", "81981818997"),
        Employee("Mana", "Olinda", "81981818998"),
        Employee("Mateus", "Jaboatao", "81981818999"),
        Employee("Vany", "Sao Lourenco", "81981818910"),
        Employee("Tototita", "Recife", "81981818911")
    )
println("Grouped by city : ${people.groupBy(Employee::city, Employee::name)}")
//Grouped by city : {Recife=[Queiroz, Tototita], Olinda=[Mana], Jaboatao=[Mateus], Sao Lourenco=[Vany]}

println("Associated by city : ${people.associateBy(Employee::city, Employee::name)}")
//Associated by city : {Recife=Tototita, Olinda=Mana, Jaboatao=Mateus, Sao Lourenco=Vany}
}