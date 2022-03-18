fun main() {
    //inisialisasi mutableListOf
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5) //menambahkan nilai 5 kedalam list
    numbers.removeAt(1) //menghapus nilai pada index ke 1
    numbers[0] = 0 //mengubah nilai pada index 0
    numbers.shuffle() //shuffle = mengacak list
    //tampilkan list
    println(numbers)

    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") //menambahkan list
    //numbersStr = mutableListOf("six", "seven") -> error

    //tampilkan list
    println(numbersStr)
}