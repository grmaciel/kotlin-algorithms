import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class BiggestKElementTest {
    val solver = BiggestKElement()

    @Test
    fun shouldFindK() {
        val input = intArrayOf(1, 5, 6, 3, 4)
        val result1 = solver.find(input, 2)
        Assert.assertThat(result1, Is.`is`(5))
        val result2 = solver.find(input, 1)
        Assert.assertThat(result2, Is.`is`(6))
        val result3 = solver.find(input, 3)
        Assert.assertThat(result3, Is.`is`(4))
    }
}