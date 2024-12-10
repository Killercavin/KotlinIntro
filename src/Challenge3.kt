// Check and return the largest number of the two inputted

fun checker(num0: Int, num1: Int) {
    if (num0 == num1){
        println("$num0 and $num1 are equal")
    } else {
        val largeNumber = num0.coerceAtLeast(num1) // but a more basic method like Math.max(num0, num1) could be used but the compiler with throw errors
        println("The largest number between $num0 and $num1 is $largeNumber")
    }
}

fun main(){
    val num0 = readln().toInt()
    val num1 = readln().toInt()

    // calling the function
    checker(num0, num1)

}