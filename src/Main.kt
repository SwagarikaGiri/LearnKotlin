//chapter 1- use of variables
//var / val
// top level variable can be worked like local variable
// String is not null
// if you want it as null it should be
// conditional operators are -- if  when () ----> instead of which()
var nameCanBeNull: String? = null

fun main() {
    val name: String = "Swagarika"
    println(nameCanBeNull)
    if(nameCanBeNull!=null){
        println(nameCanBeNull)
    }
    else{
        println("Hi")

    }
    when(nameCanBeNull){
    null -> println("hi")
        else -> println(nameCanBeNull)
    }
    val greetingToPrint = if(nameCanBeNull!=null)nameCanBeNull else "Hiiii"
    println(greetingToPrint)


}