package customerAPI;

import io.cucumber.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    private FileInputStream fis;
    public static Properties config = new Properties();
    public static String customerBasrUrl = "https://api.stripe.com/v1/customers";

    @Before
    public void setUp() throws IOException {
        fis = new FileInputStream("/Volumes/TECH/API/src/main/java/config.properties");

        config.load(fis);
    }

    public void tearDown(){

    }
}
