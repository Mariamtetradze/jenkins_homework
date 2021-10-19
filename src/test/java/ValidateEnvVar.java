import org.junit.Assert;
import org.junit.Test;

public class ValidateEnvVar {
    @Test
    public void   test() {
        Assert.assertEquals(System.getenv("USERDOMAIN_ROAMINGPROFILE"), "WINDOWS-AQ6J0FE");
    }
}
