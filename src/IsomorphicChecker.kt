class IsomorphicChecker {
    private lateinit var array: Array<Int>
    private lateinit var marked: Array<Boolean>

    fun check(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false
        array = Array(256, { -1 })
        marked = Array(256, { false })

        word1.forEachIndexed { index, key ->
            val mappedToValue = word2[index].toInt()
            if (array[key.toInt()] == -1) {
                if (!marked[mappedToValue]) {
                    array[key.toInt()] = mappedToValue
                    marked[mappedToValue] = true
                } else {
                    return false
                }
            } else if (array[key.toInt()] != mappedToValue) {
                return false
            }
        }
        return true
    }
}