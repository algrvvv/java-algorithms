package com.algrvvv.strings;

/**
 * Задача на leetcode - 2810. Faulty Keyboard
 *
 * @see <a href="https://leetcode.com/problems/faulty-keyboard/">2810. Faulty Keyboard</a>
 */
public class FaultyKeyboard {
    public static String finalString(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'i') res.reverse();
            else res.append(aChar);
        }
        return res.toString();
    }
}
