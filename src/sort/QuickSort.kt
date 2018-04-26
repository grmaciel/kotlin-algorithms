package sort

class QuickSort {
    private lateinit var input: IntArray
    fun sort(input: IntArray, reverse: Boolean = false): IntArray {
        this.input = input
        quickSort(0, input.size - 1, reverse)
        return input
    }

    private fun quickSort(low: Int, high: Int, reverse: Boolean) {
        var i = low
        var j = high
        // middle element of the list
        val pivot = input[low + (high - low) / 2]

        while (i <= j) {
            val pair = calculateIAndJForExchange(i, j, pivot, reverse)
            i = pair.first
            j = pair.second
            // we will exchange a left value that is bigger than the pivot
            // by an element in the right that is smaller than the pivot
            if (i <= j) {
                exchange(i, j)
                i++
                j--
            }
        }
        if (low < j) quickSort(low, j, reverse)
        if (i < high) quickSort(i, high, reverse)
    }

    private fun calculateIAndJForExchange(i: Int, j: Int, pivot: Int, reverse: Boolean): Pair<Int, Int> {
        var i1 = i
        var j1 = j
        // on non reverse if the value from the left of the pivot
        // is smaller than the pivot, we jump to the next element
        // if the value to the right is greater than the pivot
        // we continue to the next element

        if (reverse) {
            while (input[i1] > pivot) {
                i1++
            }
            // if the value to the right is greater than the pivot
            // we continue to the next element
            while (input[j1] < pivot) {
                j1--
            }
        } else {
            while (input[i1] < pivot) {
                i1++
            }

            while (input[j1] > pivot) {
                j1--
            }
        }
        return Pair(i1, j1)
    }

    private fun exchange(i: Int, j: Int) {
        val temp = input[i]
        input[i] = input[j]
        input[j] = temp
    }
}