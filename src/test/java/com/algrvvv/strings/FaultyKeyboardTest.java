package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaultyKeyboardTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("rtsng", FaultyKeyboard.finalString("string"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("ponter", FaultyKeyboard.finalString("poiinter"));
    }
}
