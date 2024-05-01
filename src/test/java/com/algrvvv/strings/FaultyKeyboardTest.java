package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaultyKeyboardTest {
    @Test
    public void solutionTest() {
        assertEquals("rtsng", FaultyKeyboard.finalString("string"));
        assertEquals("ponter", FaultyKeyboard.finalString("poiinter"));
    }
}
