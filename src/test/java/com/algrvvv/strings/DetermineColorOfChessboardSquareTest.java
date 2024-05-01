package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineColorOfChessboardSquareTest {
    @Test
    public void solutionTest() {
        assertFalse(DetermineColorOfChessboardSquare.squareIsWhite("a1"));
        assertTrue(DetermineColorOfChessboardSquare.squareIsWhite("h3"));
        assertFalse(DetermineColorOfChessboardSquare.squareIsWhite("c7"));
    }
}
