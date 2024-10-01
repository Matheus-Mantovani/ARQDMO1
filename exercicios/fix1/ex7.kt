package exercicios.fix1

fun main() {
    print("Informe a quantidade de numeros: ")
    val n = readln().toInt()

    val numeros = IntArray(n)

    for(i in 0..<n) {
        print("Informe o numero ${i+1}: ")
        numeros[i] = readln().toInt()
    }

    val maior = maiorNumero(numeros)
    val menor = menorNumero(numeros)

    println("Maior: $maior\nMenor: $menor")
}

fun maiorNumero(numeros: IntArray): Int {
    var maior = numeros[0]

    for(i in 1..<numeros.size) {
        if(numeros[i] > maior) {
            maior = numeros[i]
        }
    }

    return maior
}

fun menorNumero(numeros: IntArray): Int {
    var menor = numeros[0]

    for(i in 1..<numeros.size) {
        if(numeros[i] < menor) {
            menor = numeros[i]
        }
    }

    return menor
}