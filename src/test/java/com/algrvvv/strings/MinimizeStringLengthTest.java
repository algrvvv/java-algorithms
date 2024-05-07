package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimizeStringLengthTest {
     @Test
    public void firstSolutionTestCase() {
        assertEquals(3, MinimizeStringLength.minimizedStringLength("aaabc"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(3, MinimizeStringLength.minimizedStringLength("cbbd"));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals(2, MinimizeStringLength.minimizedStringLength("dddaaa"));
    }
}
