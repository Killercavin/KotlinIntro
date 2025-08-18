package dsa.array

/*
Arrays are always mutable. To access and modify elements in an array, use the indexed access operator[]
 */

fun main() {
    val simpleArray = arrayOf(0, 1, 2, 3)
    val twoDArray = Array(2) { Array(2) { 2 } }

    // Accessing elements of an array
    println("The first element of simpleArray is ${simpleArray[0]}")

    // arrays before modifications
    println(simpleArray.contentDeepToString())
    println(twoDArray.contentDeepToString()) // [[2, 2], [2, 2]]

    // Modifying an array
    twoDArray[0][1] = 10
    println(twoDArray.contentDeepToString()) // [[2, 0], [2, 2]]

    // sorting arrays
    println() // sorting in descending order

    // finding the size of an array
    println("The size of simple array is ${simpleArray.size}")

    // mathematical operations on an array
    // sum
    println("The sum of elements in the simple array is " + simpleArray.sum())

    // shuffling
    simpleArray.shuffle() // this shuffles randomly
    println("The shuffled items in the simple array is " + simpleArray.contentDeepToString())

    // converting arrays to other collections

    // arrays to list
    println(simpleArray.toList()) // you can convert it to mutable list if you want to perform some operations like
// add,  that are unique to list etc. Same can be done to sets and maps but maps is a little different since it
// involves keys and values take note of that

    // immutable lists, sets, and maps doesn't allow addition or removal of items since they can never be modified
    // once created

    val listOfArray = simpleArray.toMutableList()
    listOfArray.add(7)
    listOfArray.average()

    val setOfArray = simpleArray.toMutableSet()
    setOfArray.size
    setOfArray.add(8)
}