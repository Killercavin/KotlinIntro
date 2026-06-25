package kotlinlab.functions.callstack

fun repeat(s: String): String {
    return s + s
}

fun printLine(str: String) {
    println(str)
}

fun main() {
    _root_ide_package_.kotlinlab.functions.callstack.printLine(_root_ide_package_.kotlinlab.functions.callstack.repeat("Hello!"))
}