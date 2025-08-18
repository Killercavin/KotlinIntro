package dsa.array

/*
Like other languages we can have arrays inside other arrays too in Kotlin to form multidimensional arrays ie 2, 3, 4
and so on
 */

fun main() {
    // 2D array
    val twoDArray = arrayOf(arrayOf(0, 1, 2, 3, 4), arrayOf(5, 6, 7, 8, 9))
    println(twoDArray.contentDeepToString())

    val altTwoDArray = Array(2) { Array(2) { 0 } }
    println(altTwoDArray.contentDeepToString())

    // 3D array
    val threeDArray = Array(3) { Array(3) { Array(3) { 0 } } }
    println(threeDArray.contentDeepToString())
}