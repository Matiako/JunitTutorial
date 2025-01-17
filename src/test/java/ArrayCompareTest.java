import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayCompareTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,4,3,12};
        Arrays.sort(numbers);
//        assertEquals(expected,numbers);
        assertArrayEquals(expected,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int [] numbers = {};

            Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSort_Performance() {
        int array [] = {12,23,4};
        for (int i=1; i<=10000000;i++){
            array[0]= i;
            Arrays.sort(array);
        }
    }
}
