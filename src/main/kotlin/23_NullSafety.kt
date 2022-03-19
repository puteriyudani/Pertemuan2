fun main() {
    //pemberian nilai null yang diizinkan dalam kotlin
    var maybeNumber: Int? = 15 //menambahkan tanda ? diakhir tipe data
    maybeNumber = null //agar dapat memberikan nilai null pada suatu variabel
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}