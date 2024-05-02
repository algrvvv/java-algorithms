package com.algrvvv.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountItemsMatchingRuleTest {
    @Test
    public void firstSolutionTestCase() {
        List<List<String>> lst1 = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ));
        assertEquals(1, CountItemsMatchingRule.countMatches(lst1, "color", "silver"));
    }

    @Test
    public void secondSolutionTestCase() {
        List<List<String>> lst2 = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone")
        ));
        assertEquals(2, CountItemsMatchingRule.countMatches(lst2, "type", "phone"));
    }
}
