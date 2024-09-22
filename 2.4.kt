// Задание 4
fun main() {
    print("Введите число: ")
    val base = readLine()!!.toInt()

    print("Введите степень: ")
    val exponent = readLine()!!.toInt()

    val result = Math.pow(base.toDouble(), exponent.toDouble()).toInt()

    println("$base в степени $exponent = $result")
}
