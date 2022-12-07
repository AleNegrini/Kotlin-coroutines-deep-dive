package sequences

import java.math.BigInteger

val fibonacci: Sequence<BigInteger> = sequence {
    var first = 0.toBigInteger()
    var second = 1.toBigInteger()
    while (true){
        yield(first)
        val temp = first
        first += second
        second = temp
    }
}

fun main() {
    val iterator = fibonacci.iterator()
    for(i in 1..100)
        println(iterator.next())
}