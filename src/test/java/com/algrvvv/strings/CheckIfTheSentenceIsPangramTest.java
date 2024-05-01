package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfTheSentenceIsPangramTest {
    @Test
    public void solutionTest() {
        assertTrue(CheckIfTheSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        assertFalse(CheckIfTheSentenceIsPangram.checkIfPangram("leetcode"));
    }
}
