
fun main() {
    val a3 = true
    val b3 = false
    val c3 = false

    println("!a3 && b3: ${!a3 && b3}") // false
    println("a3 || !b3: ${a3 || !b3}") // true
    println("a3 && b3 || c3: ${a3 && b3 || c3}") // false
}
