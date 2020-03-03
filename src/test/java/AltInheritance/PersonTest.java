package AltInheritance;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person depend;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        depend = new Person("Likhona", "Male", 18);
    }

    @Test
    public void testGetGender() {
        assertFalse(depend.getName() == null);
    }

    @Test
    public void testGetAge() {
        assertEquals(depend.getAge(), 18);
    }
}