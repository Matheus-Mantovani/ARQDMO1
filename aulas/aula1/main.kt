package aulas.aula1

fun main() {
    /*
    val count: Int = 10
    println(count)

    var value: Int = 10
    value++
    println(value)
    */

    /*
    var str1 = "matheus"
    var str2 = "matheus"
    var str3: String = new String("matheus") //so funciona em java, nao sei fazer isso em kotlin
    //str = str.uppercase()
    println("str1.equals(str2): " + str1.equals(str2))
    println("str1 == str2: " + str1 == str2)

    println("str1.equals(str3): " + str1.equals(str3))
    println("str1 == str3: " + str1 == str3)
    */

    /*
    val primeiro = "Matheus"
    val meio = "Mantovani"
    val ultimo = "Goncalves"

    val completo = "$primeiro $meio $ultimo".uppercase()
    println(completo)
    */

    /*
    var str: String? // ? aceita null

    str = "Matheus"
    println("Hora do cafe, $str")

    str = null

    if(str != null)
        println("Hora do cafe, ${str.length}")

    println("Hora do cafe, ${str?.length}") // ? verifica se str é null antes de chamar o metodo (chamada segura)

    //println("Hora do cafe, ${str!!.length}") !! chama o metodo independente da situacao (forca a barra)
    */

    /*
    val question: String
    var answer: String

    question = "Palmeiras tem mundial?"
    println(question)
    answer = readln()

    val out = if(answer == "sim") {
        println("kkkkk")
        "mentiroso"
    } else {
        println("Boa!!")
        "ok"
    }

    println(out)
    */

    fun isOdd(value: Int): Boolean = value % 2 != 0;
    fun isEven(value: Int) = value % 2 == 0;

    println(isOdd(3))
    println(isEven(3))


}