package kotlinlab.classes

/**
 * Single line classes comes handy when there is no a member in the class body thereby making you ignore the {}
 */
class SingleLine (val description:  String)

fun main() {
    val singleLine =
        _root_ide_package_.kotlinlab.classes.SingleLine("This class is saying that it has no body, therefore it is called a single line class.")
    println(singleLine.description)
}