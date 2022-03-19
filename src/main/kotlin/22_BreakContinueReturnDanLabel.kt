fun main() {
    //break dan continue
    var x:Int
    println("Example of Break and Continue in For-Loop")
    for (x in 1..10) {
        if (x == 7) break //menghentikan proses perulangan ke penutup terdekat dalam suatu blok program
        if (x == 3) continue //melanjutkan perulangan ke penutup terdekat dalam suatu blok program
        print("$x ")
    }
    print('\n')

    //return
    returnLoop()

    //continue dan break label
    println()
    println("Example of Break and Continue Label")
    myLabel@ for (x in 1..10) { //menerapkan label khusus
        if (x == 5) {
            println("I am inside if block with value$x\n-- hence it will close the operation")
            break@myLabel //menentukan label
        } else {
            println("I am inside else block with value$x")
            continue@myLabel //lanjutkan perulangan
        }
        println("Not Print")
    }
}

fun returnLoop() {
    var x:Int
    println("Example of return in For-Loop")

    //perulangan for
    for (x in 1..10) {
        //kondisi
        if (x < 5) {
            print("${x - 1} ")
        }else {
            return //keluar dari fungsi dan mengembalikan suatu nilai kepada pemanggil fungsi
        }
        print("$x ")
    }
    println("Tidak akan pernah dieksekusi")
}