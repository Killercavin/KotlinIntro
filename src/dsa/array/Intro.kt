package dsa.array

/*
An array is a data structure that holds a fixed number of values of the same type or its subtypes.

When to use arrays in Kotlin
- Use arrays in Kotlin when you have specialized low-level requirements that you need to meet.

Benefits of collections over arrays
- Collections can be read-only, which gives you more control and allows you to write robust code that has a clear intent.
- t is easy to add or remove elements from collections. In comparison, arrays are fixed in size. The only way to add or remove elements from an array is to create a new array each time, which is very inefficient

Creating arrays
To create arrays in Kotlin, you can use:
. functions, such as arrayOf(), arrayOfNulls() or emptyArray().
. the Array constructor.
 */

fun main() {
    // declaring an array
    val riversArray = arrayOf("Nile", "Mississippi", "Tana", "Zambezi")
    println(riversArray.joinToString(prefix = "[", separator = ", ", postfix = "]"))
    // println(riversArray.toList())
}