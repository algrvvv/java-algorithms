package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTheTitleTest {
    @Test
    public void firstSolutionTestCase() {
        assertEquals("Capitalize The Title", CapitalizeTheTitle.capitalizeTitle("capiTalIze tHe TitLe"));
    }

    @Test
    public void secondSolutionTestCase() {
        assertEquals("First Letter of Each Word", CapitalizeTheTitle.capitalizeTitle("First leTTeR of EACH Word"));
    }
}
