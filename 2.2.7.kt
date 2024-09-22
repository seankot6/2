
fun main() {
    val a7 = true
    val b7 = false
    val c7 = false

    println("a7 || ! (a7 && b7) || c7: ${a7 || ! (a7 && b7) || c7}") // true
    println("! a7 || a7 && (b7 || c7): ${!a7 || a7 && (b7 || c7)}") // true
    println("(a7 || b7 && !c7) && c7: ${(a7 || b7 && !c7) && c7}") // false
}
