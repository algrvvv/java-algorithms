package com.algrvvv.strings;

/**
 * Задача на leetcode - 1221. Split a String in Balanced Strings
 *
 * @see <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/description/">1221. Split a String in Balanced Strings</a>
 */
public class SplitStringInBalancedStrings {
    /**
     * TODO доделать
     */
    public static int balancedStringSplit(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L' && (i+1 < chars.length && chars[i+1] == 'R')) {
                count += 1;
                i += 1;
            }else if (chars[i] == 'R' && (i+1 < chars.length && chars[i+1] == 'L')) {
                count += 1;
                i += 1;
            }
        }
        return count;
    }
}
