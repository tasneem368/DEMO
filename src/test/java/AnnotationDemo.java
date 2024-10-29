import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationDemo {



    @BeforeClass
    public void setUp() {
        System.out.println("Setup before any test methods in the class");
        // Initialize WebDriver, open browser, etc.
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Setup before each test method");
        // Navigate to the starting URL, reset test data, etc.
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
        // Your test logic here
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
        // Your test logic here
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Cleanup after each test method");
        // Clear cookies, reset state, etc.
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Cleanup after all test methods in the class");
        // Close browser, release resources, etc.
    }
}



