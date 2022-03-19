fun main() {
    //while loop
    var x:Int = 0
    println("Example of While Loop--")

    //perulangan while
    while (x <= 10) {
        print("$x ")
        x++
    }
    print('\n')

    //do-while loop
    var y:Int = 0

    //eksekusi program terlebih dahulu
    do {
        y = y + 10
        println("I am inside Do block--- $y")
    } while (y <= 50) //baru lakukan perulangan
}