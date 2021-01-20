package customerAPI;

import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.*;

public class CustomerAPI extends BaseTest{

    /*
    method to send data and return the response


     */

    public static Response postRequestForCustomerAPI() throws IOException {


        FileInputStream fis = new FileInputStream("/Volumes/TECH/API/src/main/java/customerAPI/customerAPIData.json");

        Response postResponse = (Response) given()
                .header("Content-Type", "application/json").auth().basic(config.getProperty("Access_key"), config.getProperty("Password_key"))
                .body(IOUtils.toString(fis))
                .when()
                .post(customerBasrUrl)
                .then()
                .statusCode(200)
                .and()
                .log().all();

        return postResponse;

    }
            public static Response getRequestCustomerAPI()
    {

            Response getResponse= (Response) given()
                    .header("Content-Type","application/json").auth().basic(config.getProperty("Access_key"),config.getProperty("Password_key"))
                    .when()
                    .get(customerBasrUrl)
                    .then()
                    .statusCode(200)
                    .and()
                    .log().all();

            return getResponse;

        }





    }

