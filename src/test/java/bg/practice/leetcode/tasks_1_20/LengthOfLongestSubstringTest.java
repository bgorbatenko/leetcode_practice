package bg.practice.leetcode.tasks_1_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstringTest() {
        var testingClass = new LengthOfLongestSubstring();

        assertEquals(3, testingClass.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, testingClass.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, testingClass.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, testingClass.lengthOfLongestSubstring("aab"));
    }

}