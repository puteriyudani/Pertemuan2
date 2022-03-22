//cara untuk menulis fungsi di kotlin agar kode program menjadi lebih ringkas
fun main() {
    //perintah untuk tampilkan program
    println("Max value from max function = ${max(4, 7)}")
    println("Max value from newMax function = ${newMax(3, 5)}")
}

//fungsi max
fun max(a: Int, b: Int) : Int {
    val maxValue = if (a > b) a else b //mencari nilai terbesar di fungsi max
    return maxValue
}

//fungsi newMax
fun newMax(a: Int, b: Int) : Int = if (a > b) a else b //mencari nilai terbesar di fungsi newMax