package kotlinlab.classes.dataclass

data class Recipes(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)

fun main() {
    val spaghetti = _root_ide_package_.kotlinlab.classes.dataclass.Recipes("Spaghetti Bolognese", "Beef")
}
