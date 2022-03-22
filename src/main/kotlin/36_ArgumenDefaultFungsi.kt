fun main() {
    //panggil tanpa argumen
    connectToDb()
    println() //menampilkan data sesuai yang ada di default fungsi connectToDb

    //panggil dengan 2 argumen
    connectToDb("sqlserver", "puteri") //menampilkan data dengan argumen tambahan pada variabel hostname dan username
}

//fungsi connectToDb
fun connectToDb(hostname: String = "localhost", //variabel hostname
                username: String = "mysql", //variabel username
                password: String = "secret") { //variabel password
    //tampilkan program
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}