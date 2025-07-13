package problem_of_the_day

abstract class Animal(val name: String) {
    abstract fun speak(): String
}

class Dog(name: String) : Animal(name) {
    override fun speak() = "$name barks"
}

fun makeItSpeak(animal: Animal): String {
    return animal.speak()
}

fun main() {
    val dog: Animal = Dog("Rex")
    println(makeItSpeak(dog)) // Output: Rex barks
}