package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {
    @Test
    public void solutionTest() {
        assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}
