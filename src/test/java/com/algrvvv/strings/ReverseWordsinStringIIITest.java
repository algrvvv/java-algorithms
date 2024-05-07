package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseWordsinStringIIITest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWordsinStringIII.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("rM gniD", ReverseWordsinStringIII.reverseWords("Mr Ding"));
    }
}
