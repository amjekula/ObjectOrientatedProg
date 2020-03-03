package AltInheritance;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends TestCase {
    Employee emp;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        emp = new Employee("Sakhi", "Female", 22, 2564, "Designer");
    }

    @Test
    public void testTestGetName() {
        assertSame(emp.getJobTitle(), "Designer");
    }

    public void testGetGender() {
        assertTrue(emp.getGender() == "Female");
    }
}