package string

/**
 * Complexity: O(N)
 */
class Anagram {
    fun check(input1: String, input2: String): Boolean {
        var str1 = input1.replace(" ", "").toLowerCase()
        var str2 = input2.replace(" ", "").toLowerCase()
        if (str1.length != str2.length) return false
        val counter = IntArray(26)
        str1.forEachIndexed { index, c ->
            counter[c - 'a']++
            counter[str2[index] - 'a']--
        }
        counter.forEach { if (it != 0) return false }
        return true
    }
}
