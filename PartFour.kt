package pr3

fun main() {
    println("Введите последовательность чисел")
    val s = readLine()
    if (s == null) println() else
    {
        val b = mutableListOf(" ")
        b.clear()
         s.split(" ").map {it.toInt()%10 }.forEach {
            var m = it
            var n = ""
            while (m>0) {
                n += m%2
                m /= 2
            }
            var q = ""
            for (i in 1..8-n.length)
                q +="0"
            b.add(q+n)
        }
        val r = b.first()
        val c = b.drop(1).fold(r) { res, next -> (if (res[0]=='0' && next[0]=='0') "1" else "0") +
                (if (res[1]=='0' && next[1]=='0') "1" else "0") +
                (if (res[2]=='0' && next[2]=='0') "1" else "0") +
                (if (res[3]=='0' && next[3]=='0') "1" else "0") +
                (if (res[4]=='0' && next[4]=='0') "1" else "0") +
                (if (res[5]=='0' && next[5]=='0') "1" else "0") +
                (if (res[6]=='0' && next[6]=='0') "1" else "0") +
                (if (res[7]=='0' && next[7]=='0') "1" else "0") }.split("").filter { it != "" }.map { it.toInt() }.reversed().mapIndexed { index, q -> q * Math.pow(2.toDouble(),index.toDouble()).toInt() }.sum()
        println(c)
    }
}