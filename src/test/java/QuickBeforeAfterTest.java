import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }
}
