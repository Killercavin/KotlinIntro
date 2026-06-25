package kotlinlab.functions.callstack

// last
fun mult(a: Int, b: Int): Int {
    return a * b
}

// second
fun printMult(a: Int, b: Int) {
    println(_root_ide_package_.kotlinlab.functions.callstack.mult(a, b))
}

// first
fun main() {
    _root_ide_package_.kotlinlab.functions.callstack.printMult(3, 4)
}