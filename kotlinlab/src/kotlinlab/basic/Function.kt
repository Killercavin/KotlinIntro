package kotlinlab.basic

fun sum(a: Int, b: Int): Int {
    return Math.addExact(a, b)
}

fun main(){
    print("Enter the value of a: ")
    val a = readln().toInt()
    print("Enter the value of b: ")
    val b = readln().toInt()

    _root_ide_package_.kotlinlab.basic.sum(a, b)
    println("The sum of $a and $b is ${_root_ide_package_.kotlinlab.basic.sum(a, b)}")
}