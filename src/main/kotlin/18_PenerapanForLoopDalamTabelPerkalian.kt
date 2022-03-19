fun main() {
    //tabel perkalian menggunakan perulangan
    println("Simple multiplication table using loops: ")

    //kelipatan 1
    for (i in 1..10) {
        print("$i ")
    }
    println()

    //kelipatan 2
    for (i in 1..10) {
        print("${i * 2} ")
    }
    println()

    //kelipatan 3
    for (i in 1..10) {
        print("${i * 3} ")
    }
    println()

    //kelipatan 4
    for (i in 1..10) {
        print("${i * 4} ")
    }
    println()

    //kelipatan 5
    for (i in 1..10) {
        print("${i * 5} ")
    }
    println()

    //kelipatan 6
    for (i in 1..10) {
        print("${i * 6} ")
    }
    println()

    //kelipatan 7
    for (i in 1..10) {
        print("${i * 7} ")
    }
    println()

    //kelipatan 8
    for (i in 1..10) {
        print("${i * 8} ")
    }
    println()

    //kelipatan 9
    for (i in 1..10) {
        print("${i * 9} ")
    }
    println()

    //kelipatan 10
    for (i in 1..10) {
        print("${i * 10} ")
    }

    //tabel perkalian menggunakan nested loop (perulangan bersarang)
    println("\n\nHere's a simple multiplication table using nested loops: ")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}