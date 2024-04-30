package asserts.tests;

import asserts.Assertable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import strings.MinimizeStringLength;

public class MinimizeStringLengthTest implements Assertable {
    @Override @Test
    public void solution() {
        Assert.assertEquals(3, MinimizeStringLength.minimizedStringLength("aaabc"));
        Assert.assertEquals(3, MinimizeStringLength.minimizedStringLength("cbbd"));
        Assert.assertEquals(2, MinimizeStringLength.minimizedStringLength("dddaaa"));
    }
}
