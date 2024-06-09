package bg.practice.leetcode.tasks_1_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindromeTest(){
        var testingClass = new LongestPalindrome();
        assertEquals("bb", testingClass.longestPalindrome("cbbd"));
        assertEquals("abcba", testingClass.longestPalindrome("qabcbaegagd"));
        assertEquals("a", testingClass.longestPalindrome("a"));
        assertEquals("bb", testingClass.longestPalindrome("bb"));
    }
}