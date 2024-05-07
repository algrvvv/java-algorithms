package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineColorOfChessboardSquareTest {
    @Test
    public void firstSolutionTestCase() {
        assertFalse(DetermineColorOfChessboardSquare.squareIsWhite("a1"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertTrue(DetermineColorOfChessboardSquare.squareIsWhite("h3"));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertFalse(DetermineColorOfChessboardSquare.squareIsWhite("c7"));
    }
}
