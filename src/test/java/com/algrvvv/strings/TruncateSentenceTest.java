package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruncateSentenceTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("Hello how are you", TruncateSentence.truncateSentence("Hello how are you Contestant", 4));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("What is the solution", TruncateSentence.truncateSentence("What is the solution to this problem", 4));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals("chopper is not a tanuki", TruncateSentence.truncateSentence("chopper is not a tanuki", 5));
    }
}
