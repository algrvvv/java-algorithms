package com.algrvvv.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildArrayFromPermutationTest {
    @Test
    public void firstSolutionTestCase() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 4, 5, 3));
        int[] test = BuildArrayFromPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4});
        assertEquals(expected, Arrays.toString(test));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(new int[]{4, 5, 0, 1, 2, 3}, BuildArrayFromPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }
}
