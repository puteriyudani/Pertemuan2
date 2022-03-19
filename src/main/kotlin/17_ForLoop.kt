fun main() {
    //perulangan for dengan range 1 sampai 10
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')

    print('\n')

    //perulangan for dengan array
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array $i") //menampilkan angka di dalam array
    print('\n')

    //perulangan for dengan list
    val listInt = listOf(1, 22, 83, 4)
    for ((index, value) in listInt.withIndex()) {
        println("the element at $index is $value") //menampilkan angka di dalam list
    }
}