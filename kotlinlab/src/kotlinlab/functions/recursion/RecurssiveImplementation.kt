package kotlinlab.functions.recursion

fun f(n: Int): Int {
    return when (n) {
        0 -> 4
        -1 -> 1
        else -> _root_ide_package_.kotlinlab.functions.recursion.f(n - 1) / 2 + 2 * _root_ide_package_.kotlinlab.functions.recursion.f(
            n - 2
        )
    }
}

fun main() {
    val n = readln().toInt()
    print(_root_ide_package_.kotlinlab.functions.recursion.f(n))
}
