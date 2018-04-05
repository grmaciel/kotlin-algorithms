class Palindrome {
    fun check(input: String): Boolean {
        val sanitized = input.replace(" ", "").toLowerCase()

        for (i in 0 until sanitized.length / 2) {
            var beginChar = sanitized[i]
            var endChar = sanitized[sanitized.length - i - 1]
            if (beginChar != endChar) {
                return false
            }
        }
        return true
    }
}