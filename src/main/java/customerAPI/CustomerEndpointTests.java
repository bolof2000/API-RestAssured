package customerAPI;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomerEndpointTests extends BaseTest {

    private CustomerEndPointAPI customerEndPointAPI;

    public CustomerEndPointAPI getCustomerEndPointAPI() {
        return customerEndPointAPI;
    }


    @Test
    public void testCreateCustomerAPI() throws IOException {
        this.customerEndPointAPI.baseURL();
        Response response = this.customerEndPointAPI.postRequestAPI();
        response.prettyPrint();
        int actualStatusCode = response.statusCode();
        JsonPath responseBody= new JsonPath(response.asString());
        responseBody.prettyPrint();
        Assert.assertEquals(actualStatusCode,200);

    }
}
