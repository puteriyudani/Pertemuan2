import kotlin.math.*

fun main() {
    //phi dan konstanta
    println("Pi : ${PI}\ne: ${E}")

    //tersedia fungsi matematika
    //min(), max(), round(), ceil(), floor() and truncate()
    var varDouble = 2.72
    var roundResult: Int = round(varDouble).toInt()
    println("Pembulatan round $varDouble adalah $roundResult")

    //abs() dan sign()
    //sin(), cos(), tan(), acos(), asin(), atan()
    //pow() dan sqrt()
    println("Nilai 2 pangkat 3 adalah " + 2.0.pow(3))

    //exp(), log(), log10(, log2()
    //8 = 8^(1/3)
    println("Nilai 8 pangkat 1/3 adalah " +8.0.pow((1.0 / 3.0)))

    //pembagian
    val a = 5 / 2 //int
    val b = 5.0 / 2 //double
    val c = 5 / 2.0 //double
    val d = 5.0 / 2.0 //double
    //val e: Int = 5 / 2.0
    //val f: Double = 5 / 2
    print("$a\n$b\n$c\n$d")

}