fun main() {
    println("Welcome to our calculator")
    var goOn = "yes"

    //perulangan while
    while (goOn == "yes") {
        //input angka pertama
        println("Enter the first number: ")
        val a = readLine()!!.toDouble()

        //input angka kedua
        println("Enter the second number: ")
        val b = readLine()!!.toDouble()

        //pilih salah satu pilihan
        println("Choose one of the following operations: ")
        println("1 - addition") //penjumlahan
        println("2 - subtraction") //pengurangan
        println("3 - multiplication") //perkalian
        println("4 - division") //pembagian
        val choice = readLine()!!.toInt()
        var result: Double = 0.0

        //kondisi berdasarkan pilihan
        when (choice) {
            1 -> result = a + b
            2 -> result = a - b
            3 -> result = a * b
            4 -> result = a / b
        }
        if ((choice > 0) && (choice < 5)) {
            println("Result: $result")
        } else {
            println("Invalid choice")
        }

        //apakah ingin melakukan penghitungan yang lain?
        println("Would you like to make another calculation? [yes/no]")
        goOn = readLine()!!
    }
    println("Thank you for using our calculator.")
}