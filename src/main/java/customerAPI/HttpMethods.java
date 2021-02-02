package customerAPI;

import io.restassured.response.Response;

import java.util.Map;

public abstract class  HttpMethods {

    /*
    Functions common to all API endpoints is define here
     */

    public abstract Response postRequestAPI(Map<String, String> map, String URI);
    public abstract Response getRequestAPI(Map<String, String> map,String URI);
    public abstract Response putRequestAPI(Map<String, String> map,String URI);
    public abstract Response patchRequestAPI(Map<String, String> map,String URI);

}
