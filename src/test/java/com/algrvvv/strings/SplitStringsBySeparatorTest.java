package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SplitStringsBySeparatorTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals(new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six")),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(Arrays.asList("one.two.three", "four.five", "six")),
                        '.'
                ));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(new ArrayList<>(Arrays.asList("easy", "problem")),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(Arrays.asList("$easy$", "$problem$")),
                        '$'
                ));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals(new ArrayList<>(List.of()),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(List.of("|||")),
                        '|'
                ));
    }
}
