// Even odd number checker

fun main(){
    print("Enter a number: ")
    var num = readln().toInt()
    if (num % 2 == 0){
        println("$num is even")
    } else {
        println("$num is odd")
    }
}