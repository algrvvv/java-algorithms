package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueOfVariableAfterPerformingOperationsTest {
    @Test
    public void solutionTest() {
        assertEquals(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        assertEquals(3, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        assertEquals(0, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}
