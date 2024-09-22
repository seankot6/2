
fun main() {
    val x4 = true
    val y4 = true
    val z4 = false

    println("!x4 && y4: ${!x4 && y4}") // false
    println("x4 || !y4: ${x4 || !y4}") // true
    println("x4 || y4 && z4: ${x4 || y4 && z4}") // true
}
