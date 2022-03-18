fun main() {
    //contoh array dengan tipe primitive
    var x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2] //penjumlahan array indeks 1 dan 2
    x.forEach { print(it.toString() + ' ') }
    print('\n')

    //array tipe data int batasan 5 dengan nilai [0, 0, 0, 0, 0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

    //array tipe data int batasan 5 dengan nilai [42, 42, 42, 42, 42]
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

    //array tipe data int batasan 5 dengan nilai [0, 1, 2, 3, 4]
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}