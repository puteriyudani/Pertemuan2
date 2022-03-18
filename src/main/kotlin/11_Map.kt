fun main() {
    //map menyimpan entri
    //key unik, tetapi key yang berbeda dapat dipasangkan dengan nilai yang sama
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") //sama dengan sebelumnya

    //dua map yang berisi pasangan yang sama merupakan map yang sama, terlepas dari urutan pasangannya
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap == anotherMap}")

    //mutableMap adalah map dengan operasi penulisan map
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)

    //hashMapOf
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) //tampilkan "1"
}