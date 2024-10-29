import org.testng.annotations.*;

public class Test1 extends Main {

    @Test (groups = "Regression")// annotation // EXCUTION IS ALPHABITCALLY // priorty is for dependencies in tcs
    public void should_return_user_if_the_name_contains_special_character2() { // function name and declartion
        System.out.println("second  testNG testcase  ' should_return_user_if_the_name_contains_special_character2'");
    }
    @Test () // annotation
    public void should_return_correct_name() { // function name and declartion
        System.out.println("third  testNG testcase ");
    }
    @Test (priority = 0) // annotation
    public void a (){ // function name and declartion
        System.out.println("first  testNG testcase ");
    }
    @Test () // annotation
    public void z ()  { // function name and declartion
        System.out.println("first  testNG testcase ");
    }
}
