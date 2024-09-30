
fun main() {
    print("Insira um numero: ")
    val num = readln().toInt()

    println(amigavel(num))
}

fun amigavel(num: Int): Boolean {
    var res: Boolean = false
    var amigo = 0
    var soma = 0

    for(i in 1..num/2) {
        if(num % i == 0) {
            amigo += i
        }
    }

    for(i in 1..amigo/2) {
        if(amigo % i == 0) {
            soma += i
        }
    }

    if(amigo == soma) {
        res = true
    }

    return res
}
