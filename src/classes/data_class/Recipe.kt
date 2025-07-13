package classes.data_class

data class Recipe(val title: String, val isVegetarian: Boolean)

fun main() {
    val r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)

    // check equality of the objects
    println(r1 == r2)
}

