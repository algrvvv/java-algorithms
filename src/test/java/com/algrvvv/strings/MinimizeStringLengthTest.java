package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeStringLengthTest {
    @Test
    public void solutionTest() {
        assertEquals(3, MinimizeStringLength.minimizedStringLength("aaabc"));
        assertEquals(3, MinimizeStringLength.minimizedStringLength("cbbd"));
        assertEquals(2, MinimizeStringLength.minimizedStringLength("dddaaa"));
    }
}
