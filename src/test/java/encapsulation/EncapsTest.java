package encapsulation;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EncapsTest extends TestCase {
    Encaps encaps;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        encaps = new Encaps("Athi", 33);
    }

    @Test
    public void testTestGetName() {
        assertEquals(encaps.getName(), "Athi");
    }

    @Ignore("I don't want to test this yet")
    @Test
    public void testGetAge() {
        assertSame(encaps.getAge(), 33);
    }
}