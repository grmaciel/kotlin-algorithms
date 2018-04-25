class BiggestKElement {
    fun find(input: IntArray, k: Int): Int {
        // implement bubble or quick sort
        input.sortDescending()
        return input.distinct()[k - 1]
    }
}