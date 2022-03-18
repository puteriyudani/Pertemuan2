fun main() {
    //set menyimpan element unik, pada umumnya urutannya tidak terdefinisi
    val numbers = setOf(1, 2, 3, 4)
    //menampilkan jumlah elemen didalam set
    println("Number of elements: ${numbers.size}")
    //jika di dalam set terdapat angka 1, tampilkan kalimat berikut
    if (numbers.contains(1)) println("1 is in the set")

    //cek apakah nilai variabel numbers sama dengan numbersBackwards
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //Implementasi default Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    //tampilkan nilai yang ada di dalam set, jika lebih dari 1 maka tampilkan sekali saja
    val strings = hashSetOf("a", "b", "c", "c") //nilai hash set unik
    println("My Set Values are $strings")
}