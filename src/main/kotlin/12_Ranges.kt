fun main() {
    //deklarasi variabel i dengan nilai 2
    val i:Int = 2
    for (j in 1..4) //pengulangan 1 sampai 4
        print(j) //tampilkan "1234"
    println()

    //cek apakah nilai variabel i ada di range 1 sampai 10
    if (i in 1..10) {
        println("we found your number --$i")
    }
}