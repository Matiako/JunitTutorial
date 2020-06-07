import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class StringHelperParametrizedBooleanTest {
    StringHelper helper = new StringHelper();
    private String input;
    private Boolean expectedBoolean;



    public StringHelperParametrizedBooleanTest(String input, boolean expectedBoolean) {
        this.input = input;
        this.expectedBoolean = expectedBoolean;
    }

    @Parameterized.Parameters
    public static Collection testConditionsBoolean(){
        return Arrays.asList(new Object[][] {
                { "AA", true },
                { "A", true },
                { "AAAA", true },
        });
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
        assertEquals(expectedBoolean,helper.areFirstAndLastTwoCharactersTheSame(input));
    }
}
