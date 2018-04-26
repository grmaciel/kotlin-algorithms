package array

/**
 * Complexity: O(N)
 * Space: O(N)
 */

class ArrayRotator {
    fun rotate(array: IntArray, steps: Int): IntArray {
        var result = IntArray(array.size)

        for (i in 0 until array.size) {
            result[(steps + i) % array.size] = array[i]
        }
        return result
    }
}