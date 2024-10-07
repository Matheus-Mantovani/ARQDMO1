package exercicios.fix2.ex1

fun main() {
    var m1 = UsMoney(5, 80)
    var m2 = UsMoney(1, 90)
    var m3 = m1.plus(m2)

    println("${m3.dollars}.${m3.cents}") //expected output 7.70


    m1.dollars = 1
    m1.cents = 50

    m2.dollars = 1
    m2.cents = 50

    m3 = m2.plus(m1)

    println("${m3.dollars}.${m3.cents}") //expected output 3.0


    m1.dollars = 1
    m1.cents = 199

    m2.dollars = 1
    m2.cents = 234

    m3 = m2.plus(m1)

    println("${m3.dollars}.${m3.cents}") //expected output 6.33
}