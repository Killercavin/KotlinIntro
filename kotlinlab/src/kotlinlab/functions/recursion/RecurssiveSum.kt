package kotlinlab.functions.recursion

fun sumRecursive(n: Int): Int {
    // base case
    if (n <= 1) {
        return n
    }
    // recursive case
    return n + _root_ide_package_.kotlinlab.functions.recursion.sumRecursive(n - 1)
}

fun main() {
    val n = readln().toInt()
    print(_root_ide_package_.kotlinlab.functions.recursion.sumRecursive(n))
}
