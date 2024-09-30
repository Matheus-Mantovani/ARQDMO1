package exercicios.fix1

import kotlin.reflect.typeOf

fun main() {
    print("Informe a quantidade de linhas: ")
    val linhas = readln().toInt()

    pum(linhas)
}

fun pum(linhas: Int) {
    for(i in 1..linhas) {
        if (i % 4 != 0) {
            print("$i ")
        } else {
            println("PUM")
        }
    }
}
