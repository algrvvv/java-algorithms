package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfTheSentenceIsPangramTest {
    @Test
    public void firstSolutionTestCase() {
        assertTrue(CheckIfTheSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertFalse(CheckIfTheSentenceIsPangram.checkIfPangram("leetcode"));
    }
}
