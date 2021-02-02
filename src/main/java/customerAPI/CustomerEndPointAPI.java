package customerAPI;

import io.restassured.response.Response;
import jdk.incubator.jpackage.internal.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class CustomerEndPointAPI extends HttpMethods {
    public Response postRequestAPI(Map<String,String> map, String URI) {
       Response response = given().
               auth().
               basic("","").
               formParam(map.toString()).
               post(URI);

       return response;
    }

    public Response getRequestAPI(Map<String,String> map, String URI) {
        Response response = given().
                auth().
                basic("","").
                formParam(map.toString()).
                get(URI);
        return response;
    }

    public Response putRequestAPI(Map<String,String> map, String URI) {
        return null;
    }

    public Response patchRequestAPI(Map<String,String> map, String URI) {
        return null;
    }

    /*
    method to send data and return the response


     */





    }

