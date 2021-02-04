fun sayHello(itemToGreet: String ){
    println("hello Kotlin \t $itemToGreet")

}
fun sayOptimizedHello(str1:String,str2:String)=println("$str1 \t $str2")

/***
 * The optimized case of writing the same function
 */
fun main() {
sayHello("How are you")
    sayOptimizedHello("Hello","World")
    sayOptimizedHello("Hello","Kitty")
}