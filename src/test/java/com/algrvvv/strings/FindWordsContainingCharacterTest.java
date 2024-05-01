package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWordsContainingCharacterTest {
    @Test
    public void solutionTest() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 1)), FindWordsContainingCharacter.findWordsContaining(new String[]{"leet", "code"}, 'e'));
        assertEquals(new ArrayList<>(Arrays.asList(0, 2)), FindWordsContainingCharacter.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
        assertEquals(new ArrayList<>(List.of()), FindWordsContainingCharacter.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'z'));
    }
}
