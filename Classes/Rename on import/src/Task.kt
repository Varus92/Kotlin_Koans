import kotlin.random.Random

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
             Random.nextInt(2) +
            " Java random:" +
            Random.nextInt(2) +
            "."
}