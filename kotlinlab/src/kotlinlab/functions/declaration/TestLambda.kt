package kotlinlab.functions.declaration

fun first(value: Int, func: (Int) -> Int): Int = func(value)
fun second(func: (Int) -> Int, value: Int): Int = func(value)

fun main() {
    println(_root_ide_package_.kotlinlab.functions.declaration.first(5) { i -> i })
    println(_root_ide_package_.kotlinlab.functions.declaration.first(5) { it })
    println(_root_ide_package_.kotlinlab.functions.declaration.first(5) { it })
    println(_root_ide_package_.kotlinlab.functions.declaration.second({ i -> i }, 5))
    println(_root_ide_package_.kotlinlab.functions.declaration.second({ it }, 5))
    // println(second(5) { it })
}