package customerAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public abstract class  HttpMethods {

    /*
    Functions common to all API endpoints is define here
     */

    public abstract Response postRequestAPI() throws IOException;
    public abstract Response getRequestAPI();
    public abstract Response putRequestAPI();
    public abstract Response patchRequestAPI();
    public String baseURL(){

       return RestAssured.baseURI = "";
    }
    public String payload(String json) throws IOException {
        return new String(Files.readAllBytes(Paths.get(json)));
    }


}
