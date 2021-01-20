package customerAPI;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    private FileInputStream fis;
    public static Properties config = new Properties();
    public static String customerBasrUrl = "https://api.stripe.com/v1/customers";

    @BeforeClass
    public void setUp() throws IOException {
        fis = new FileInputStream("/Volumes/TECH/API/src/main/java/config.properties");

        config.load(fis);
    }

    public void tearDown(){

    }
}
