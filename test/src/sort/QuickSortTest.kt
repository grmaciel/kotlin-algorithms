package sort

import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test
import sort.QuickSort

class QuickSortTest {
    @Test
    fun shouldSort() {
        val quick = QuickSort()
        val result = quick.sort(intArrayOf(9, 4, 1, 2, 3, 5))
        Assert.assertThat(result, Is.`is`(intArrayOf(1, 2, 3, 4, 5, 9)))
    }

    @Test
    fun shouldSortReversed() {
        val quick = QuickSort()
        val result = quick.sort(intArrayOf(9, 4, 1, 2, 3, 5), true)
        Assert.assertThat(result, Is.`is`(intArrayOf(9, 5, 4, 3, 2, 1)))
    }
}