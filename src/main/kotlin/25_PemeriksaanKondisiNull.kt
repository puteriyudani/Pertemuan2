fun main() {
    //kondisi
    var maybeNumber: Int? = 15
    if (maybeNumber != null) //jika variabel tidak sama dengan null
        println(maybeNumber * 2) //lakukan operasi
    else
        println("The entered value isn't a number")
}