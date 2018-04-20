/**
 * Complexity: O(N)
 * Space: O(N)
 */

class ArrayRotator {
    fun rotate(array: IntArray, rotateIndex: Int): IntArray {
        var endArray = IntArray(array.size)

        for (i in (rotateIndex + 1) until array.size) {
            endArray[i - (rotateIndex + 1)] = array[i]
        }

        var totalElements = array.size - (rotateIndex + 1)
        for (i in 0..rotateIndex) {
            endArray[totalElements] = array[i]
            totalElements++
        }
        return endArray
    }
}