package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleStringTest {
    @Test
    public void solutionTest() {
        assertEquals("leetcode", ShuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        assertEquals("abc", ShuffleString.restoreString("abc", new int[]{0, 1, 2}));
    }
}
