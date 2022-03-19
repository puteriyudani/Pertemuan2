fun main() {
    //var maybeNumber: Int? = 15
    //maybeNumber = null
    // println(maybeNumber * 2) -> error surround with null check

    //var s1 = "Hello"
    //var s2: String? = "World"
    //println(s1.length)
    //println(s2.length)

    //menggunakan operator !! untuk melewatkan pemeriksaan nilai null
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)

    maybeNumber = null
    //println(maybeNumber!! * 2) -> error
}