import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
    @Parameters ({"bro", "ver"})
    @Test
    public void  a (String bro, String ver){
     System.out.println("OPEN "+ bro + " Browser" + " with " + ver + " version" );
 }
}
// MORE DYNAMIC