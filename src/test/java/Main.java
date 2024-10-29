import org.testng.annotations.*;

public class Main {
    @BeforeClass // before(), beforeAll(),
    public void beforeClass() {
        System.out.println("before class in the class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("after  class in the class");
    }
    @BeforeMethod  //BEFOREEACH
    public void beforeMethod() {
        System.out.println("before methods in the class");
    }
    @AfterMethod // AFTER EACH
    public void afterMethod() {
        System.out.println("after methods in the class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("before test in the class");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("after test in the class");
    }
    @BeforeSuite
   public void beforeSuite() {
      System.out.println("before suite in the class");
   }
    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite in the class");
    }
}
//   exclution    <methods>
//            <exclude name="should_return_user_if_the_name_contains_special_character1"/>
//            </methods>
//