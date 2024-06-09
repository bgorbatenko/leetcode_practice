package bg.practice.leetcode.tasks_1_20;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        var charArray = s.toCharArray();
        var charUsing = new HashMap<Character, Integer>();
        var stringSize = charArray.length;
        var maxLength = 0;
        var index = 0;
        var count = 0;
        while (index < stringSize) {
            var nextChar = charArray[index];
            if(charUsing.containsKey(nextChar)) {
                if (count > maxLength) {
                    maxLength = count;
                }
                count = 0;
                index = charUsing.get(nextChar) + 1;
                charUsing.clear();
            } else {
                charUsing.put(nextChar, index);
                count++;
                index++;
            }
        }
        return Math.max(maxLength, count);
    }

}
