package string

import org.junit.Before
import org.junit.Test
import string.IsomorphicChecker
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsomorphicCheckerTest {
    lateinit var checker: IsomorphicChecker

    @Before
    fun setup() {
        checker = IsomorphicChecker()
    }

    @Test
    fun wordsOfDifferentLengthShouldNotBeIsomorphic() {
        val result = checker.check("a", "aa")
        assertFalse(result)
        val result2 = checker.check("", "bb")
        assertFalse(result2)
    }

    @Test
    fun wordsWithSameLatterOneToOneRelationAreIsometric() {
        val result = checker.check("lala", "bibi")
        assertTrue(result)
        val result2 = checker.check("iixxcc", "bbaauu")
        assertTrue(result2)
    }

    @Test
    fun wordsAlreadyMappedCantBeMappedAgain() {
        val result = checker.check("ll", "ab")
        assertFalse(result)
        val result2 = checker.check("llc", "aaa")
        assertFalse(result2)
    }

    @Test
    fun checkInputWords() {
        assertTrue(checker.check("LALALA", "XOXOXO"))
        assertFalse(checker.check("GCGCGC", "HHHCCC"))
        assertFalse(checker.check("BBBMMM", "EGONUH"))
    }
}