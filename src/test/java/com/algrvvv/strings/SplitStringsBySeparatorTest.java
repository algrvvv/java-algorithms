package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringsBySeparatorTest {
    @Test
    public void solutionTest() {
        assertEquals(new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six")),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(Arrays.asList("one.two.three", "four.five", "six")),
                        '.'
                ));

        assertEquals(new ArrayList<>(Arrays.asList("easy","problem")),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(Arrays.asList("$easy$","$problem$")),
                        '$'
                ));

        assertEquals(new ArrayList<>(List.of()),
                SplitStringsBySeparator.splitWordsBySeparator(
                        new ArrayList<>(List.of("|||")),
                        '|'
                ));
    }
}
