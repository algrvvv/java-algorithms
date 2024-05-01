package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalParserInterpretationTest {
    @Test
    public void solutionTest() {
        assertEquals("Goal", GoalParserInterpretation.interpret("G()(al)"));
        assertEquals("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
        assertEquals("alGalooG", GoalParserInterpretation.interpret("(al)G(al)()()G"));
    }
}
