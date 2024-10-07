package exercicios.fix2.ex2

class Carta(argValor: Int, argNaipe: Char) {

    init {
        if(argValor < 0 || argValor > 13) {
            println("Valor invalido")
        }
        if(!naipeValido(argNaipe)) {
            println("Naipe invalido")
        }
    }

    var valor: Int = argValor
        get() {
            return field
        }
        set(value) {
            if(value > 0 && value < 14) {
                field = value
            } else {
                println("Valor invalido.")
            }
        }

    var naipe: Char = argNaipe
        get() {
            return field
        }
        set(naipe) {
            if(naipeValido(naipe)) {
                field = naipe
            } else {
                println("Naipe invalido.")
            }
        }

    private fun naipeValido(naipe: Char): Boolean {
        return naipe.equals('P', true) || naipe.equals('C', true) || naipe.equals('O', true) || naipe.equals('E', true)
    }
}