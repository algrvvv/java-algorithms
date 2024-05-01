package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePrefixOfWordTest {
    @Test
    public void solutionTest() {
        assertEquals("dcbaefd", ReversePrefixOfWord.reversePrefix("abcdefd", 'd'));
        assertEquals("zxyxxe", ReversePrefixOfWord.reversePrefix("xyxzxe", 'z'));
        assertEquals("abcd", ReversePrefixOfWord.reversePrefix("abcd", 'z'));
    }
}
