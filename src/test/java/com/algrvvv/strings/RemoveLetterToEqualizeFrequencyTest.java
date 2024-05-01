package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveLetterToEqualizeFrequencyTest {
    @Test
    public void solutionTest() {
        assertTrue(RemoveLetterToEqualizeFrequency.equalFrequency("abcc"));
        assertFalse(RemoveLetterToEqualizeFrequency.equalFrequency("aazz"));
    }
}
