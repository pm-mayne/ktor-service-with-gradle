package engine

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EngineTest {

    @Test
    fun testNominalCase() {
        val input = listOf(4, 4, 1, 1, 2, 8, 8, 8, 10, 2, 3, 4, 3, 3, 5, 6, 7, 7, 8)

        val triplicatesRemoved = Engine.removeDuplicates(input, 2)
        val duplicatesRemoved = Engine.removeDuplicates(input, 1)

        println(triplicatesRemoved)
        println(duplicatesRemoved)

        Assertions.assertIterableEquals(listOf(1, 2, 10, 5, 6, 7), triplicatesRemoved)
        Assertions.assertIterableEquals(listOf(10, 5, 6), duplicatesRemoved)
    }
}