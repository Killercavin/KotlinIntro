package dsa.array

/*
In Kotlin, you can work with arrays by using them to pass a variable number of arguments to a function or perform operations on the arrays themselves.

 */

fun printAllStrings(vararg strings: String) {
    strings.forEach { print(it) }
}

fun main() {
    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray)
}