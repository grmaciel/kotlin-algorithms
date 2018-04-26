package array

import sort.QuickSort

class BiggestKElement {
    fun find(input: IntArray, k: Int): Int {
        val result = QuickSort().sort(input, true)

        var uniqueSteps = 1
        var previousValue = result[0]
        for (i in 0 until result.size) {
            val value = result[i]
            if (value != previousValue) {
                uniqueSteps++
            }
            if (uniqueSteps == k) {
                return value
            }
            previousValue = value
        }
        return -1
    }
}