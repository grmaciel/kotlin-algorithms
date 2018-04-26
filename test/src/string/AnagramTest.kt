package string

import org.junit.Test
import string.Anagram
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramTest {
    val anagram = Anagram()

    @Test
    fun anagramsShouldBeTheSameLength() {
        assertFalse(anagram.check("aa", "aaa"))
        assertFalse(anagram.check("aaab", "baa"))
    }

    @Test
    fun shouldBeTrueTheseAnagrams() {
        assertTrue(anagram.check("William Shakespeare", "I am a weakish speller"))
        assertTrue(anagram.check("silent", "listen"))
    }

    @Test
    fun notAnagram() {
        assertFalse(anagram.check("hutrcbay", "babcrtuh"))
    }
}