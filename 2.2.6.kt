
fun main() {
    val x6 = false
    val y6 = false
    val z6 = true

    println("x6 || y6 && !z6: ${x6 || y6 && !z6}") // false
    println("x6 && !y6 || z6: ${x6 && !y6 || z6}") // true
    println("!x6 && !y6: ${!x6 && !y6}") // true
    println("x6 && (!y6 || z6): ${x6 && (!y6 || z6)}") // false
    println("! (x6 && z6) || y6: ${! (x6 && z6) || y6}") // true
    println("x6 || (! (y6 || z6)): ${x6 || (! (y6 || z6))}") // false
}
