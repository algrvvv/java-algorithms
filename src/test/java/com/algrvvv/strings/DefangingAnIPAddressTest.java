package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangingAnIPAddressTest {
    @Test
    public void solutionTest() {
        assertEquals("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", DefangingAnIPAddress.defangIPaddr("255.100.50.0"));
    }
}
