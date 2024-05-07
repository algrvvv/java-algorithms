package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ToLowerCaseTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("hello", ToLowerCase.toLowerCase("Hello"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("here", ToLowerCase.toLowerCase("here"));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals("lovely", ToLowerCase.toLowerCase("LOVELY"));
    }
}
