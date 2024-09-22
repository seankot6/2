fun main() {
    print("Введите двузначное число: ")
    val number = readLine()!!.toInt()

    val tens = number / 10
    val units = number % 10
    val sum = tens + units
    val product = tens * units

    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")
}
