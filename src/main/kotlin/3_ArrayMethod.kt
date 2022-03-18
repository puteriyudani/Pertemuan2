fun main() {
    //sort()
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    //reverse() dan reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    //array simpsonsE size 5
    val simpsonsE = arrayOf("Homer","Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)

    //pernyataan bahwa array tidak kosong menggunakan isEmpty()
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong!")

    //tampilkan program
    println("Min = " + simpsonsE.min()) //array yang memiliki huruf paling sedikit
    println("Max = " +simpsonsE.max()) //array yang memiliki huruf paling banyak
    println("First = " + simpsonsE.first()) //array pertama
    println("Last = " + simpsonsE.last()) //array terakhir
    println(simpsonsE.contains("Marge"))
}