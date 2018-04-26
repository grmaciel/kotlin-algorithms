package array

import array.ArrayRotator
import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class ArrayRotatorTest {
    val rotator = ArrayRotator()

    @Test
    fun shouldRotateArray() {
        val result = rotator.rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
        Assert.assertThat(result, Is.`is`(intArrayOf(5, 6, 7, 1, 2, 3, 4)))
    }

    @Test
    fun shouldRotateArrayWithOneElementOnyAfterK() {
        val result = rotator.rotate(intArrayOf(1, 2, 3), 1)
        Assert.assertThat(result, Is.`is`(intArrayOf(3, 1, 2)))
    }
}

