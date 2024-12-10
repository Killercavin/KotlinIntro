// Building a basic calculator

fun main(){
    val num0: Int = readLine()!!.toInt()
    val num1: Int = readLine()!!.toInt()

    val sum = num0 + num1
    val difference = num0 - num1
    val product = num0 * num1
    val divide = num0 / num1
    val modulus = num0 % num1

    println(" The sum  of num0 and num1 is $sum")
    println(" The difference between num0 and num1 is $difference")
    println(" The product  of num0 and num1 is $product")
    println(" num0 divided by num1 is $divide")
    println(" The remainder of num0 and num1 is $modulus")
}