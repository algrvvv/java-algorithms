package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNestingDepthOfTheParenthesesTest {
    @Test
    public void solutionTest() {
        assertEquals(3, MaximumNestingDepthOfTheParentheses.maxDepth("(1+(2*3)+((8)/4))+1"));
        assertEquals(3, MaximumNestingDepthOfTheParentheses.maxDepth("(1)+((2))+(((3)))"));
    }
}
