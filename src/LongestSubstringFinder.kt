class LongestSubstringFinder {
    fun find(input: String): String {
        var marked = BooleanArray(26)
        var substring = ""
        var tempString = ""

        for (i in 0 until input.length) {
            val character = input[i]
            val asciiIndex = character - 'a'
            if (marked[asciiIndex]) {
                substring = longestSubstring(substring, tempString)
                tempString = ""
                marked = BooleanArray(26)
            }
            tempString += character
            marked[asciiIndex] = true
        }
        substring = longestSubstring(substring, tempString)
        return substring
    }

    private fun longestSubstring(substring: String, tempString: String): String {
        var substring1 = substring
        if (substring1.length < tempString.length) substring1 = tempString
        return substring1
    }
}