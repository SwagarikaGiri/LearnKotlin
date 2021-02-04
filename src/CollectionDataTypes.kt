
fun main() {
    val interestingThings = arrayOf("Kotlin","Programming","Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    for(interestingThing in interestingThings)
        println(interestingThing)
    println("After the functional programming way")
    interestingThings.forEach{
        println(it)
    }
    /***
     * By doing this we lost the hold of the index data
     */
    interestingThings.forEach{interestingThing ->
        println(interestingThing)
    }
    interestingThings.forEachIndexed{index, interestingThing ->
        println("$interestingThing at $index")
    }
    /***
     * what is applicable for array is also applicable for the string too
     */
    val interestingList = listOf("Kotlin","Programming","Comic Books")
    println(interestingList[0])

    /***
     * One more collection type is Map It will simple take pair
     * i.e key value, map
     */
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{key,value -> println("$key -> $value")}
    /***
     * most data types are immutable by nature and if u want to handle with muttable string
     * mutableArrayOf , mutableListOf , mutableMapOf
     */
}