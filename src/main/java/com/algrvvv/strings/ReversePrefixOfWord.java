package com.algrvvv.strings;

/**
 * @see <a href="https://leetcode.com/problems/reverse-prefix-of-word/">2000. Reverse Prefix of Word</a>
 */
public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        StringBuilder strToSwap = new StringBuilder();
        char[] wcs = word.toCharArray();
        boolean firstMeet = false;
        for (char wc : wcs) {
            if (wc == ch && !firstMeet) { strToSwap.append(wc); strToSwap.reverse(); firstMeet = true; }
            else strToSwap.append(wc);
        }
        return strToSwap.toString();
    }
}
