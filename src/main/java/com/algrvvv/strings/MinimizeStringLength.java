package com.algrvvv.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/minimize-string-length/">2716. Minimize String Length</a>
 */
public class MinimizeStringLength {
    public static int minimizedStringLength(String s) {
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (uniqueChars.contains(c)) continue;

            uniqueChars.add(c);
        }

        return uniqueChars.size();
    }
}
