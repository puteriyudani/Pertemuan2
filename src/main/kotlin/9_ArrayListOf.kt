fun main() {
    //Array lists (mutable) bisa diubah
    /*
    Method:
    clear(), contains(), size, get() or [], add() or +=, remove() or -=,
    removeAt(), toTypedArray(), lastIndexOf(), removeAll(), reverse()
    */

    //inisialisasi arrayList
    val arrayList = arrayListOf(1, 2, 3)
    //input arrayList
    print("ArrayList array : ")
    for (item in arrayList) {
        print("$item")
    }
    print("\n")

    //menambahkan elemen 9 kedalam arrayList
    arrayList += 9
    print("Tambahkan elemen 9 dalam arrayList : ")
    println(arrayList)

    //membalikkan arrayList
    arrayList.reverse()
    print("Reverse arrayList : ")
    println(arrayList)

    //menghapus element terakhir didalam arrayList
    arrayList -= 1 //bisa dihapus
    print("Remove last element in arrayList : ")
    println(arrayList)

    //meletakkan range atau jarak didalam arrayList
    arrayList += (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}