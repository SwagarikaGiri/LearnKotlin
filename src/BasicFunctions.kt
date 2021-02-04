fun getGreeting():String{
    return "Hello Kotlin"
}
fun sayHello():Unit{
   println("It is function that returns nothing")
}
fun singleExpression() = "Single Expression"

fun main() {
    println("It is in main function")
    println(getGreeting())
    sayHello()
    println(singleExpression())
}