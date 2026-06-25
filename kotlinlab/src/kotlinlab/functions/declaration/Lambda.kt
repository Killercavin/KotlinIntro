package kotlinlab.functions.declaration

val add = { x: Int, y: Int -> x + y } // this is a lambda function

fun main() {
    println(_root_ide_package_.kotlinlab.functions.declaration.add(1, 2))
    println(_root_ide_package_.kotlinlab.functions.declaration.add.invoke(1, 2))
}

/*
 * Key features of lambda functions:
 *    Implicit return (last expression is returned)
 *
 *    No explicit return keyword
 *
 *    Cannot specify the function's return type explicitly
 */