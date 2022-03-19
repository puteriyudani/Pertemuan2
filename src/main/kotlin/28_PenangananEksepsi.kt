fun main() {
    //menghalangi aplikasi memberikan output yang salah saat runtime
    //eksepsi merupakan turunan dari kelas Throwable
    try { //try
        val myvar:Int = 10
        val v:String = "Rekayasa Perangkat Lunak"
        v.toInt()
    } catch (e:Exception) { //catch
        e.printStackTrace()
    } finally { //finally
        println("Exception Handling in Kotlin")
    }
}