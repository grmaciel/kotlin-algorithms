class LongestSubstringFinder {
    fun find(input: String): String {
        var marked: BooleanArray
        var substring = ""
        var start = 0
        var finished = false

        while (!finished) {
            var tempString = ""
            marked = BooleanArray(26)
            run loop@ {
                for (i in start until input.length) {
                    val c = input[i]
                    val index = c - 'a'
                    if (marked[index]) {
                        if (input.length - i <= substring.length) {
                            finished = true
                        } else {
                            start = i
                        }
                        return@loop
                    }
                    tempString += c
                    marked[index] = true
                }
                finished = true
            }
            if (substring.length < tempString.length) substring = tempString
        }
        return substring
    }
}