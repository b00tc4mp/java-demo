import junit.framework.*;
import junit.textui.*;

public class HelloTest extends TestCase {
    private String name;
    private String salutation;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(HelloTest.class);
    }

    protected void setUp() {
        name = "Peter Pan";
    }

    public void testSalute() {
        salutation = Hello.salute(name);

        assertEquals(salutation, "Hello, Peter Pan!");
    }

    protected void tearDown() {
        name = null;
        salutation = null;
    }
}