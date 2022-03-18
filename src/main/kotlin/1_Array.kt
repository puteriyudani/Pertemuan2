fun main() {
    //array merupakan kumpulan data yang sejenis (1 tipe data)

    //deklarasi variabel array arrA
    var arrA = arrayOf<Int>()
    arrA += 34
    //tampilkan array indeks 0
    println(arrA[0])

    //deklarasi variabel array arrB
    var arrB = arrayOf<Int>()
    //pengulangan arrB dari angka 1-10
    for (i in 1..10) {
        arrB += i
    }

    //pengulangan untuk menampilkan arrB
    for (i in arrB) {
        print("$i ")
    }

    //contoh pembuatan array berdasarkan template Array standard Kotlin

    //array dengan batasan
    val asc = Array(5) {
        i -> (i * i).toString() //operasi perkalian, lalu di ubah ke tipe data string
    }
    asc.forEach { println(it) }
}