import kotlin.math.sqrt

fun main() {
    //menghitung akar kuadrat
    //sqrt() adalah singkatan dari SQuare Root
    print("Enter some number and I'll calculate a square root : ") //input angka yang akan dicari akar kuadrat nya
    val a = readLine()!!.toDouble()

    //kondisi
    if (a > 0) {
        println("The number you entered is greater than 0, so I can calculate it!")
        val root = sqrt(a) //akar kuadrat menggunakan sqrt()
        println("The square root of $a is $root") //hasil
    } else
        println("I can't calculate the square root of a negative number!") //tidak bisa menghitung akar kuadrat dari bilangan negatif
    println("Thanks for the input")
}