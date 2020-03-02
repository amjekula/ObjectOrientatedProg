import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends TestCase {
    Person employee;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        employee = new Employee("Athi", "Male", 23, 6846, "Programmer");
    }

    @Test
    public void testJobTitle(){
        assertEquals(employee.getName(), "Athi");
    }
}