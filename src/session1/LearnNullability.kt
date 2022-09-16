package session1

//by default any data type in kotlin can not be null
val nonNullableString: String = "Non-nullable string"

//to make any datatype nullable we should add the question mark after the datatype
val nullableString: String? = null

fun main() {

    //accessing any nullable variable should be by using the safe call operator
    nullableString?.length

    //the data type of the variable returned from using the safe call is always nullable
    //as the variable it self may be null
    val nullableLength = nullableString?.length

    // to make the returned variable not nullable we use elvis operator so the compiler will
    //always be sure that there is a result for length

    val nonNullabeLength = nullableString?.length ?: 0
}
