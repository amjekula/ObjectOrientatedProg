package polymorphism;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MiniBusTest extends TestCase {
    MiniBus taxi;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        taxi = new MiniBus();
    }

    @Test(timeout = 2)
    public void testWheelNum() {
        assertSame(taxi.wheelNum(), 4);
    }

    @Test
    public void testVehType() {
        assertEquals(taxi.vehType(), "Mini Bus");
    }
}