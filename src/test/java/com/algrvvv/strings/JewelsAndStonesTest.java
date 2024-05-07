package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JewelsAndStonesTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}
