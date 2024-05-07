package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWordsContainingCharacterTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 1)), FindWordsContainingCharacter.findWordsContaining(new String[]{"leet", "code"}, 'e'));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 2)), FindWordsContainingCharacter.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
    }

    @Test
    public void thirdSolutionTestCase() {
        assertEquals(new ArrayList<>(List.of()), FindWordsContainingCharacter.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'z'));
    }
}
