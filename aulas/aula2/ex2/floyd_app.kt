package aulas.aula2.ex2

fun main() {
    val floyd = Floyd(4, '@')

    floyd.simbolo = 'V'

    floyd.imprime(true)
    floyd.imprime(false)
}