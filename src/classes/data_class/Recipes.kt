package classes.data_class

data class Recipes(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)

fun main() {
    val spaghetti = Recipes("Spaghetti Bolognese", "Beef")
}
