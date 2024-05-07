package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePrefixOfWordTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("dcbaefd", ReversePrefixOfWord.reversePrefix("abcdefd", 'd'));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("zxyxxe", ReversePrefixOfWord.reversePrefix("xyxzxe", 'z'));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals("abcd", ReversePrefixOfWord.reversePrefix("abcd", 'z'));
    }
}
