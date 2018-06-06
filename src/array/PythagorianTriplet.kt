package array

/**
 * Complexity: O(N3)
 */
class PythagorianTriplet {
    fun find(input: IntArray): Boolean {
        for (i in 0 until input.size) {
            val current = input[0].square()
            for (j in (i + 1) until input.size) {
                val next = input[j].square()
                for (z in (j + 1) until input.size) {
                    val sum = input[z].square()
                    if (current == next + sum || next == current + sum || sum == next + current) {
                        return true
                    }
                }
            }
        }
        return false
    }
}

fun Int.square(): Int = Math.pow(this.toDouble(), 2.toDouble()).toInt()
