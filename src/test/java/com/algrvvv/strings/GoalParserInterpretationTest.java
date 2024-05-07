package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalParserInterpretationTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("Goal", GoalParserInterpretation.interpret("G()(al)"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals("alGalooG", GoalParserInterpretation.interpret("(al)G(al)()()G"));
    }
}
