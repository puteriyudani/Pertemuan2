fun main() {
    //input angka antara 10 sampai 20
    println("Enter a number between 10-20 : ")
    val a = readLine()!!.toInt() //inputan string diubah ke Int
    //kondisi
    if (a >= 10 && a <= 20) {
        println("The condition has been met.") //tampilan jika kondisi benar
    } else {
        println("You did it wrong.") //tampilan jika kondisi salah
    }

    //input angka antara 10 sampai 20 atau 30 sampai 40
    println("\nEnter a number between 10-20 or 30-40 : ")
    val b = readLine()!!.toInt()
    //kondisi
    if (((b >= 10) && (b <= 20)) || ((b >= 30) && (b <= 40))) {
        println("The condition has been met.") //tampilan jika kondisi benar
    } else {
        println("You did it wrong.") //tampilan jika kondisi salah
    }
}