package exercicios.fix1

fun main() {
    print("Forneça um numero para fatorial: ")
    val num = readln().toInt()

    println(fatorial(num))
}

fun fatorial(num: Int): Int {
    if(num <= 0) return 0;

    var res = 1

    for(i in num downTo 1) {
        res *= i
    }

    return res
}