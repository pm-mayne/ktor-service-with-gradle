package engine

class Engine {
    companion object {
        fun removeDuplicates(input: List<Int>, n: Int): List<Int> {
            return input
                .map { x -> x to input.count { it == x } }
                .distinct()
                .filter { it.second <= n }
                .map { it.first }
        }
    }

}
