import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {
    val palindrome = Palindrome()

    @Test
    fun theseAreNotPalindromes() {
        assertFalse(palindrome.check("Redrum murde"))
        assertFalse(palindrome.check("aabbccdaabb"))
    }

    @Test
    fun palindromesShouldHaveTheSameLettersStartingOnTheOppositeDirection() {
        assertTrue(palindrome.check("abcba"))
        assertTrue(palindrome.check("abccba"))
        assertTrue(palindrome.check("Redrum murder"))
        assertTrue(palindrome.check("A man a plan a canal Panama"))
        assertTrue(palindrome.check("Redrum sir is murder"))
    }
}