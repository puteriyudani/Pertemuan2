fun main() {
    //kalkulator eksponensial (pangkat)
    println("Exponent calculator")
    println("===================")

    //input angka dasar
    println("Enter the base: ")
    val a = readLine()!!.toInt()

    //input angka eksponen (pangkatnya)
    println("Enter the exponent: ")
    val n = readLine()!!.toInt()
    var result = a

    //operasi eksponen menggunakan perulangan
    for (i in 1..n-1) {
        result = result * a
    }

    //tampilkan hasil
    println("Result: $result")
    println("Thank you for using our exponent calculator")
}