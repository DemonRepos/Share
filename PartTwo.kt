package pr3

fun main() {
    println("Введите последовательность чисел")
    val s: String = readLine().toString()
    if (s == "") println("Вы ничего не ввели")
    else {
        val a = s.split(" ").map { it.split("").toSet().filter{ it != ""} }.flatten().groupBy{it}.mapValues { it.value.count() }
        val b = listOf(0,1,2,3,4,5,6,7,8,9).filter{ if (a.containsKey("$it")) a.getValue("$it") ==s.split(" ").size-2 else s.split(" ").size==2}
        println(b)
    }

}