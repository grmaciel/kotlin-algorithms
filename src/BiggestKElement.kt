class BiggestKElement {
    fun find(input: IntArray, k: Int): Int {
        // implementar sorting bubble or quicksort
        input.sortDescending()
        return input.distinct()[k - 1]
    }
}