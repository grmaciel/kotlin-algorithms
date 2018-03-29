class IsomorphicChecker {
    private val chars = HashMap<Char, Char>()

    fun check(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false
        chars.clear()

        word1.forEachIndexed { index, key ->
            val mappedToChar = word2[index]
            if (chars.contains(key)) {
                if (chars[key] != mappedToChar) return false
            } else if (chars.containsValue(mappedToChar)) {
                return false
            } else {
                chars[key] = mappedToChar
            }
        }
        return true
    }
}