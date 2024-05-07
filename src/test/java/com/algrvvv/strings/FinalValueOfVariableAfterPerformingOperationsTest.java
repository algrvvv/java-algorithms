package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinalValueOfVariableAfterPerformingOperationsTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(3, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals(0, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));    }
}
