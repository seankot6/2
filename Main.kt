
fun main() {
    print("Введите делимое: ")
    val dividend = readLine()!!.toInt()

    print("Введите делитель: ")
    val divisor = readLine()!!.toInt()

    val result = dividend / divisor

    println("$dividend / $divisor = $result")
}
