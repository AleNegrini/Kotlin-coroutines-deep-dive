package sequences

val bigBangTheoryCharacters = sequence {
    yield("Sheldon Cooper")
    yield("Penny")
    yield("Howard Wolowitz")
    yield("Amy Farrah Fowler")
}

fun main() {
    for (character in bigBangTheoryCharacters) {
        println(character)
    }
}