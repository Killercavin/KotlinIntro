package kotlinlab.classes.examples

class User(val name: String, age: Int) {
    init {
        println("User $name created, age $age")
    }
}

fun main() {
    val user = _root_ide_package_.kotlinlab.classes.examples.User("Cavin", 21)
    println("Hello, ${user.name}")
}
