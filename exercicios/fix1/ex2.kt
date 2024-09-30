package exercicios.fix1

fun main() {
    print("Infore o primeiro numero:")
    val n1 = readln().toDouble()

    print("Infore o segundo numero:")
    val n2 = readln().toDouble()

    print("Infore o terceiro numero:")
    val n3 = readln().toDouble()

    val resultado = if(n1 == n2 && n1 == n3) {
        "Equilatero"
    } else if(n1 == n2 || n1 == n3 || n2 == n3) {
        "Isosceles"
    } else {
        "Escaleno"
    }

    println(resultado)
}