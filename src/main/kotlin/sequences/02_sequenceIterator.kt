package sequences

val bigBangTheoryCharactersIter = sequence {
    yield("Sheldon Cooper")
    yield("Penny")
    yield("Howard Wolowitz")
    yield("Amy Farrah Fowler")
}

fun main() {
    val iterator = bigBangTheoryCharactersIter.iterator()
    println("First value ${iterator.next()}")
    println("Second value ${iterator.next()}")
    println("Third value ${iterator.next()}")
}