package array

class ZigZagOrdering {
    fun rearrange(input: IntArray): IntArray {
        input.forEachIndexed { index, i ->
            if ((index + 1) < input.size) {
                var current = input[index]
                var next = input[index + 1]

                if (index % 2 == 0) {
                    if (current > next) {
                        input[index + 1] = current
                        input[index] = next
                    }
                } else {
                    if (current < next) {
                        input[index + 1] = current
                        input[index] = next
                    }
                }

//                if (swap) {

//                }
            }
        }
        return input
    }
}