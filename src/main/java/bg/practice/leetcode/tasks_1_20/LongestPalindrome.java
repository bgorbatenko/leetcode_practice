package bg.practice.leetcode.tasks_1_20;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>Given a string s, return the longest  palindromic substring in s.</p>
 * <p>Example 1:<br />
 * Input: s = "babad"<br />
 * Output: "bab"<br />
 * Explanation: "aba" is also a valid answer.<br /></p>
 * <p>Example 2: <br />
 * Input: s = "cbbd"<br />
 * Output: "bb"<br /></p>
 * <p>Constraints:<br />
 * 1 <= s.length <= 1000<br />
 * s consist of only digits and English letters.<br /></p>
 */
@Slf4j
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        var chars = s.toCharArray();
        var palindromeStart = 0;
        var palindromeLength = 1;
        for (int i = 0; i < chars.length; i++) {
            for(int j = 1; j < (chars.length - i + 1); j++) {
                if (isPalindrome(chars, i, j) && j > palindromeLength) {
                    palindromeLength = j;
                    palindromeStart = i;
                }
            }
        }
        return s.substring(palindromeStart, palindromeStart+palindromeLength);
    }

    private boolean isPalindrome(char[] chars, int from, int length) {
        var i = from;
        var j = from + length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            } else {
                i++; j--;
            }
        }
        return true;
    }
}
