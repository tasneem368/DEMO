import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {
    @Test
    public void Test4() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Test started");

        softAssert.assertEquals(1, 2, "First assertion failed");
        softAssert.assertTrue(false, "Second assertion failed");

        System.out.println("Test completed");
        softAssert.assertAll();

         // This will collate all the assertion results and mark the test as failed if any assertion failed
    }
}

