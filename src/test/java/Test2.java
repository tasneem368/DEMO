import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 extends Main { // MAIN PACKAGE
    @Parameters("bro")
    @Test (groups = {"Regression","Sanity"}) // annotation
    public void should_return_user_if_the_name_contains_special_character1(String bro) {// function name and declartion
        String expectedResult = "User";
        String actualResult =  Name.checkName("nema@");
        System.out.println(expectedResult);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
 /*<groups>
        <run>
            <include name=""/>
        </run>
    </groups>*/