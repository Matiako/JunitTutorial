import org.junit.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CheckIntTest {
    private int expectedInt;
    private int firstInput;
    int secondInput;
    AnotherClass anotherClass = new AnotherClass();

    public CheckIntTest(int expectedInt, int firstInput, int secondInput) {
        this.expectedInt = expectedInt;
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    @Parameterized.Parameters
    public static Collection<Map>testConditions() {

        return
    }






    @Test
    public void addTwoInt_IfSummEqualTwoInts_ReturnSumm() {
    assertEquals(expectedInt,anotherClass.addTwoInt(firstInput,secondInput));
    }
}
