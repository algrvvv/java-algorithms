package asserts.tests;

import arrays.SortThePeople;
import asserts.Assertable;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortThePeopleTest implements Assertable {
    @Override @Test
    public void solution() {
        List<String> expected = Arrays.asList("Mary","Emma","John");
        List<String> actual = Arrays.asList(SortThePeople.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));

        Assert.assertEquals(expected, actual);
    }
}
