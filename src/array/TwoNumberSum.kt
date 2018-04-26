package array

/**
 * BigO: O(N)
 */
class TwoNumberSum {
    fun find(input: IntArray, target: Int): Pair<Int, Int> {
        var map = HashMap<Int, Int>()
        for (i in 0 until input.size) {
            var current = input[i]
            if (map.containsKey(current)) {
                return Pair(map[current]!!, i)
            } else {
                map[target-current] = i
            }
        }
        return Pair(0, 0)
    }
}