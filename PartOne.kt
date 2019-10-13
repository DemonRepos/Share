package pr3

fun main() {
    println("Введите целое число")
    val a = readLine()
    if (a == "" || a!!.toIntOrNull() == null || a.toIntOrNull()!!.toInt()<0) println("Ввод осуществлен некорректно")
    else
    {
    val b = a.map { it.toInt()-48 }.filter { it%2==0 }.sorted().firstOrNull()
    println("Ответ: $b")
    }
}