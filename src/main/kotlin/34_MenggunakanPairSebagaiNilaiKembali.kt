fun main() {
    //deklarasi variabel x dan y
    var (x, y) = bigSmall(5, 3)

    //perintah untuk tampilkan program
    println("Nilai x = $x")
    println("Nilai y = $y")
}

//fungsi bigSmall
fun bigSmall(a: Int, b:Int) : Pair<Int, Int> { //tipe data pengembalian adalah Int dengan menggunakan Pair
    //kondisi
    if (a > b) return Pair(a, b)
    else {
        return Pair(b, a)
    }
}