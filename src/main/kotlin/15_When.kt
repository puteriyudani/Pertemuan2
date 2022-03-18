fun main() {
    //when adalah operator pengganti switch-case di bahasa pemrograman C
    var x:Int = 5

    //kondisi
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2") //x bukan 1 atau 2
        }
    }

    x = 2
    when (x) {
        1,2 -> println("Value of X either 1,2") //nilai x adalah 1,2
        else -> {
            println("x is neither 1 nor 2") //x bukan 1 atau 2
        }
    }
}