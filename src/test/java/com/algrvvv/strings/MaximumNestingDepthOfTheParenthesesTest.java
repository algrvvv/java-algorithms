package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumNestingDepthOfTheParenthesesTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals(3, MaximumNestingDepthOfTheParentheses.maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(3, MaximumNestingDepthOfTheParentheses.maxDepth("(1)+((2))+(((3)))"));
    }
}
