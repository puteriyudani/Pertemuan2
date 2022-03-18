//collections berisi sejumlah objek yang memiliki tipe yang sama
//jenis koleksi di Kotlin terdiri dari list, set,dan map
fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s ")
    println()
}

fun main() {
    //collections list
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    //collections set
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}