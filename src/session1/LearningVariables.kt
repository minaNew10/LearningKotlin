package session1

import kotlin.random.Random


//val is a read-only variable
//custom getter (invoked in each access of the variable)
val num: Int
    get() = getNumber()

//lateinit variable should be "var" and have a type
private lateinit var name: String

//constants should be val & a primitive datatype
//known at compile time
const val number = 1

fun main() {
    //value of num is changed
    println(num)
    println(num)

    //if name (lateinit var) isn't initialized it will lead to NPE
    name = "mina"


}


fun getNumber(): Int {
    return Random.nextInt()
}


//println(listOf('a', 'b', 'c').joinToString(
//separator = "", prefix = "(", postfix = ")"))
