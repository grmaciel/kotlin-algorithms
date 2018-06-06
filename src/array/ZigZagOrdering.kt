package array

/**
 * Complexity: O(N)
 */
class ZigZagOrdering {
    fun rearrange(input: IntArray): IntArray {
        input.forEachIndexed { index, i ->
            if ((index + 1) < input.size) {
                var swap = false
                var current = input[index]
                var next = input[index + 1]

                if (index % 2 == 0) {
                    if (current > next) {
                        swap = true
                    }
                } else {
                    if (current < next) {
                        swap = true
                    }
                }
                if (swap) {
                    input[index + 1] = current
                    input[index] = next
                }
            }
        }
        return input
    }
}