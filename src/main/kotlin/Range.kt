fun main() {

    println("UP to")// == 1 .. 10
    for(i in 1..10) {
        print("$i ")
    }

    println("\nUNTIL >>") // == 1 .. 9
    for(i in 1 until 10) {
        print("$i ")
    }

    println("\nDOWN to >> ") // 10 .. 1
    for(i in  10 downTo 1) {
        print ("$i ")
    }

    println("\nUP to step 2")// == 1 3 5 7 9
    for(i in 1..10 step 2) {
        print("$i ")
    }

    println("\nUP to alphabetic")// == a b c d e f g h i j k l m n o p q r s t u v w x y z
    for(i in 'a'..'z') {
        print("$i ")
    }

    println("\nUP to alphabetic step 4")// == a e i m q u y
    for(i in 'a'..'z' step 4) {
        print("$i ")
    }
}