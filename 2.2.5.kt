
fun main() {
    val x5 = true
    val y5 = true
    val z5 = false

    println("!x5 && y5: ${!x5 && y5}") // false
    println("x5 || !y5: ${x5 || !y5}") // true
    println("x5 || y5 && z5: ${x5 || y5 && z5}") // true
}
