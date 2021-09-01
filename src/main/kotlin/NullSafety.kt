fun main() {
    var neverNull: String = "This cant be null"

    // neverNull = null // compile error

    var nullable: String? = "You can keep a null here"

    nullable = null

    var inferredNonNull = "The compiler assumes non-null"

    //inferredNonNull = null //compile error


}