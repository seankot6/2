
fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()

    val root = Math.sqrt(number.toDouble()).toInt()

    println("Корень числа $number = $root")
}
