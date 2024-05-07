package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveLetterToEqualizeFrequencyTest {
    @Test
    public void firstSolutionTestCase() {
        assertTrue(RemoveLetterToEqualizeFrequency.equalFrequency("abcc"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertFalse(RemoveLetterToEqualizeFrequency.equalFrequency("aazz"));
    }
}
