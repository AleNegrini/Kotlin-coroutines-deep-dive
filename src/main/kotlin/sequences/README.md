# Sequences

For people - like me - used to write python code, _Kotlin sequences_ may look like generator functions, functions that
behave like iterators.
For all the others, a Kotlin sequence is a similar concept to a **collection** (like _List_ or _Set_), but it is
evaluated lazily, meaning the next element is always calculated on demand, when it is needed.
Unlike collections, sequences don't contain elements. 

This brings to some advantages:
* they can be infinite
* they are memory-efficient
* only the minimal number of required operations are performed

To create a sequence, the simplest way to do it is to call the `sequenceOf` function.

```kotlin
val seq = sequenceOf(1,2,3,4)
```

Alternatively, Kotlin provides the _sequence_ builder function, a lambda expression where elements are calculated and
_yielded_ on demand.
They return an element to the sequence consumer and suspend the execution until the next element is requested. 

```kotlin
val seq = sequence {
    yield(1)
    yield(2)
    yield(3)
    yield(4)
}
```

The `yield` function produces the next element of the sequence.

What is essential to remember here is that each number is generated on demand, not in advance. 

This is made possible by the `Suspension` concept, that will be analysed in further details in the next chapters.

## Example code snippets

1. Write a simple sequence - [code](01_simpleSequence.kt)
2. Use iterator for accessing the sequence elements - [code](02_sequenceIterator.kt)
3. Create a sequence that contains the fibonacci series - [code](03_fibonacciSequence.kt)