class LongestSubstringFinder {
    fun find(input: String): String {
        var maxFound = 0
        var marked = BooleanArray(26)
        var substring = ""

        var start = 0
        for (i in start until input.length) {

        }
        run loop@{
            input.forEachIndexed { index, c ->
                val index = c - 'a'
                if (marked[index]) {
                    var start = index
                    for (i in start until input.length) {

                    }
                    return@loop
                }
                substring += c
                marked[index] = true

                if (index - input.length < maxFound) {

                    // we can break but fuck this improvement
                }
            }
        }

        return substring
    }

    fun check(start: Int, input: String) {
        for (i in start until input.length) {

        }
    }
}