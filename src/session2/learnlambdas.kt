package session2

fun main() {
    //function reference
    val funVar = ::sayHello
    funVar.invoke()

    ///////////////////////////////////////////////////////////////////////////////
    // lambda
    val funLam = {
        println("hello from lambda")
    }

    funLam()
    funLam.invoke()

    //////////////////////////////////////////////////////////////////////////////
    //function data type
    val funLam2: () -> Unit = {
        print("hello from lam")
    }

    val funLam3: (String) -> String = { name ->
        "hello $name"
    }

    println(funLam3("hamada"))

    // function as a return type
    greeting(true).invoke()

    //function as an argument
    val addition: (Int, Int) -> Int = { num1, num2 ->
        num1 + num2
    }
    val sub: (Int, Int) -> Int = { num1, num2 ->
        num1 - num2
    }
    val res = calcOperation(3, 5) { num1, num2 -> num1 + num2 }
    val result = calcOperation(3, 5, addition)
}

fun calcOperation(num1: Int, num2: Int, operationVar: ((Int, Int) -> Int)): Int {
    return operationVar(num1, num2)
}

fun sayHello() {
    println("Hello")
}

val goodMorning = {
    println("Good MOrning")
}
val goodEvening = {
    println("Good Evening")
}

fun greeting(isMorning: Boolean): () -> Unit {
    return if (isMorning) goodMorning else goodEvening
}

