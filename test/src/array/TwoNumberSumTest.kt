package array

import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class TwoNumberSumTest {
    private val twoNumber = TwoNumberSum()

    @Test
    fun shouldFindTheFirstNumbers() {
        val result = twoNumber.find(intArrayOf(1, 2, 3, 4), 7)
        Assert.assertThat(result.first, Is.`is`(2))
        Assert.assertThat(result.second, Is.`is`(3))

        val result2 = twoNumber.find(intArrayOf(2, 7, 11, 15), 9)
        Assert.assertThat(result2.first, Is.`is`(0))
        Assert.assertThat(result2.second, Is.`is`(1))
    }
}