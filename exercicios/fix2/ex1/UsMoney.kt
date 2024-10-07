package exercicios.fix2.ex1

class UsMoney(var dollars: Int, var cents: Int) {

    init {
        if(cents > 99) {
            dollars += cents / 100
            cents = cents % 100
        }
    }

    fun plus(addMoney: UsMoney) = UsMoney((dollars + addMoney.dollars), (cents + addMoney.cents))
}