package customerAPI;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import jdk.incubator.jpackage.internal.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class CustomerEndPointAPI extends HttpMethods {


    @Override
    public Response postRequestAPI() throws IOException {

       final String CustomerEndPoint = "customer";
        baseURL();
        return given().header("Content-Type","Application.json")
                .body(payload("/Volumes/TECH/API/src/main/java/customerAPI/customer.json")).when().post(CustomerEndPoint);
    }

    @Override
    public Response getRequestAPI() {
        return null;
    }

    @Override
    public Response putRequestAPI() {
        return null;
    }

    @Override
    public Response patchRequestAPI() {
        return null;
    }
}

