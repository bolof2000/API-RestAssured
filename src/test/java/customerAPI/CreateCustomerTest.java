package customerAPI;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateCustomerTest  {

    @Test
    public void testCreateCustomerAPI() throws IOException {

         // System.out.println(response.statusCode());
        Response response = CustomerAPI.postRequestForCustomerAPI();

        Assert.assertEquals(response.statusCode(),200);
        response.prettyPrint();

    }

    @Test
    public void testGetCustomerAPI(){

        Response response = CustomerAPI.getRequestCustomerAPI();
        Assert.assertEquals(response.statusCode(),200);
        response.prettyPrint();
    }

}
