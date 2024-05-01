package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToLowerCaseTest {
    @Test
    public void solutionTest() {
        assertEquals("hello", ToLowerCase.toLowerCase("Hello"));
        assertEquals("here", ToLowerCase.toLowerCase("here"));
        assertEquals("lovely", ToLowerCase.toLowerCase("LOVELY"));
    }
}
