package mjeks.athenkosi;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person dependent;

    public void setUp() throws Exception {
        super.setUp();
        dependent = new Person("Zizipo", "Female", 13);
    }

    @Test
    public void testTestGetName() {
        assertSame(dependent.getName(), "Zizipo");
    }


}