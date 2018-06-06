package array

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PythagorianTripletTest {
    val triplet = PythagorianTriplet()

    @Test
    fun shouldHavePythagorianTriplet() {
        assertTrue(triplet.find(intArrayOf(3, 1, 4, 6, 5)))
        assertTrue(triplet.find(intArrayOf(3, 4, 5)))
        assertTrue(triplet.find(intArrayOf(5, 4, 3)))
    }

    @Test
    fun shouldNotHavePythagorianTriplet() {
        assertFalse(triplet.find(intArrayOf(10, 4, 6, 12, 5)))
        assertFalse(triplet.find(intArrayOf(1, 4, 5)))
    }
}