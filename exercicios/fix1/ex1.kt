package exercicios.fix1

fun main() {
    var l1: Int
    var l2: Int

    print("Insira o primeiro lado:")
    l1 = readln().toInt()
    print("Insira o segundo lado:")
    l2 = readln().toInt()

    if(l1 == l2) {
        println("É um quadrado")
    } else {
        println("Nao e um quadrado");
    }
}
