package aulas.aula2.ex1

fun main() {
    val calculadora = Calculadora();
    val a = 10
    val b = 5

    println("$a + $b = ${calculadora.soma(a, b)}")
    println("$a * $b = ${calculadora.multiplicacao(a, b)}")

}