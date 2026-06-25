package kotlinlab.functions.recursion

fun m(x: Int, y: Int): Int {
    return if (x < y) {
        x
    } else {
        _root_ide_package_.kotlinlab.functions.recursion.m(x - y, y)
    }
}


fun main() {
    println(_root_ide_package_.kotlinlab.functions.recursion.m(50, 7))
}