package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsinStringIIITest {
    @Test
    public void solutionTest() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWordsinStringIII.reverseWords("Let's take LeetCode contest"));
        assertEquals("rM gniD", ReverseWordsinStringIII.reverseWords("Mr Ding"));
    }
}
