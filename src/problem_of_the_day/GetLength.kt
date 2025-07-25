package problem_of_the_day

fun getLength(input: String?): Int {
    return input?.length ?: -1
}

fun main() {
    println(getLength("John"))
    println(getLength(null))
}