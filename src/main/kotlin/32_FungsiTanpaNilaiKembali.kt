//fungsi di kotlin di deklarasikan menggunakan keyword fun

fun main() {
    displayMessage("Rekayasa Perangkat Lunak", 10)
}

//fungsi displayMessage
fun displayMessage(msg: String, count: Int) {
    //deklarasi variabel counter dengan nilai awal 1
    var counter = 1

    //perulangan
    while (counter <= count) {
        println("$msg $counter") //tampilkan
        counter++ //counter = counter + 1
    }
}