package array

import org.junit.Test
import org.hamcrest.core.Is
import org.junit.Assert

class ZigZagOrderTest {
    val zigZag = ZigZagOrdering()
    @Test
    fun shouldOrderInZigZagFashion() {
        val result = zigZag.rearrange(intArrayOf(1, 4, 3, 2))
        Assert.assertThat(result, Is.`is`(intArrayOf(1, 4, 2, 3)))
        val result2 = zigZag.rearrange(intArrayOf(4, 3, 7, 8, 6, 2, 1))
        Assert.assertThat(result2, Is.`is`(intArrayOf(3, 7, 4, 8, 2, 6, 1)))
    }
}