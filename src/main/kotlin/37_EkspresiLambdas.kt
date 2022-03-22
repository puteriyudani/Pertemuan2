//selalu dikelilingi tanda blok '{}'
fun main() {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //fungsi lambda
    val myLambda: (String)->Unit = {s:String-> print(s)}
    val v:String = "Jurusan Teknik Informatika"
    myLambda(v)

    //fungsi sebaris
    myFun(v, myLambda) //melewati lambda sebagai parameter fungsi lain
}

//fungsi MyFunction
fun MyFunction(x: String): String {
    var c:String = "Hey! Welcome To Politeknik Negeri Bengkalis --- "
    return (c + x) //menggabungkan kalimat di variabel c dan x
}

//fungsi myFun
fun myFun(a:String, action:(String)->Unit) { //melewati lambda
    print("\nHeyyy!!!")
    action(a) //panggilan ke fungsi lambda
}