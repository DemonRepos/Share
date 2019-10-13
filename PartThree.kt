package pr3

fun main() {
    println("Введите последовательность слов")
    val s = readLine().toString()
    if (s == "") println("Вы ничего не ввели")
    else {
        val b = s.split(" ").filter {  it != "" && it.length%2==1}.sortedBy { it.length }.first().last()
        println(b)
    }
}