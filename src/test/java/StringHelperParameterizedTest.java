import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;



    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {{"AACD", "CD"}, {"ACD", "CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions_Condition() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_PositiveNegative() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
    }

    @After
    public void teardown() {
        System.out.println("after");
    }

    @AfterClass
    public static void after() {
        System.out.println("after class");
    }
}