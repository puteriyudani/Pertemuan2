fun main() {
    //kondisi
    if (15 > 5)
        println("True")
    println("The program continues here...")

    //If - else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    //kondisi untuk mencari nilai maksimum
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximun of a or b is $max")

    //If - else if
    var myVar: Int = 0
    if (myVar == 0) {
        myVar = 1
    } else if (myVar == 1) {
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah $myVar")

    //input angka
    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    //kondisi jika nilai yang di inputkan lebih besar dari 5
    if (intNumber > 5)
        println("The number you entered is greater than 5!")
    println("Thanks for the input!")
}