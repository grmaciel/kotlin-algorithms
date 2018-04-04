import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class LongestSubstringTest {
    val substring = LongestSubstringFinder()

    @Test
    fun oneTestToRuleThemAll() {
        assertThat(substring.find("aaa"), `is`("a"))
        assertThat(substring.find("aabb"), `is`("a"))
        assertThat(substring.find("abcabcbb"), `is`("abc"))
        assertThat(substring.find("abcaabcde"), `is`("abcde"))
    }
}