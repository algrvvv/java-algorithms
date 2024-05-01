package com.algrvvv.strings;

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */
public class ReverseWordsinStringIII {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.split(" ");
        for (String sl : split) {
             res.append(new StringBuilder(sl).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}
