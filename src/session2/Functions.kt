package session2

fun main() {

//
    //fun that has default arguments can be called without passing arguments
    fun5()

    //if we provide one argument without naming it will always be the first one
    fun5("hamada")

    //error
    //fun5(10)

    //however we can provide the second but with naming
    fun5(age = 15)

    //we can also flip the arguments with naming
    fun5(age = 20, name = "mina")

    //    println(listOf('a', 'b', 'c').joinToString(separator = "/" ,postfix = ")", prefix = "("))
}

fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int): Int {
    return if (a > b) a else b
}


fun max3(a: Int, b: Int) = if (a > b) a else b


fun fun4() {
    fun local() {

    }
}

fun fun5(name: String = "hamada", age: Int = 10) {
    println("$name age is $age")
}