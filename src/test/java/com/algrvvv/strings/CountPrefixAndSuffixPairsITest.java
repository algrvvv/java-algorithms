package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrefixAndSuffixPairsITest {
    @Test
    public void solutionTest() {
        assertEquals(4, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
        assertEquals(2, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"}));
    }
}
