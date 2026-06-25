package kotlinlab.basic

fun main() {
    val number = readln().toInt()
    println(_root_ide_package_.kotlinlab.basic.round(number) ?: 0) // use Elvis operator to make the null for greater inputs to 0
}

// do not change function below

fun round(number: Int): Int? {
    return if (number >= 1000) null else number
}