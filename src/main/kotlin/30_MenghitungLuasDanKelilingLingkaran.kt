import kotlin.math.PI

fun main() {
    //latihan lanjutan
    print("Enter the circle's radius (cm) : ") //input radius (jari-jari) lingkaran
    val radius = readLine()!!.toDouble()

    var circumference = 2 * PI * radius //rumus keliling lingkaran
    var area = PI * radius * radius //rumus luas lingkaran

    //tampilkan program
    println("The circle's circumference based on the given radius is : $circumference cm")
    println("Area of the circle is $area cm^2")
}