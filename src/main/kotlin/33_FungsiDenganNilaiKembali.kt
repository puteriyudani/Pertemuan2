fun main() {
    val listNumber = listOf(1, 2, 3, 4, 5, 6)
    println("Jumlah nilai pada elemen listNumber = ${getSum(listNumber)}")
}

//fungsi getSum
fun getSum(values: List<Int>) : Int { //tipe pengembalian adalah Int
    //deklarasi variabel total dengan nilai awal 0
    var total = 0

    //pengulangan
    for (i in values) total += i //operasi penjumlahan angka yang ada di dalam list
    return total //mengembalikan nilai
}