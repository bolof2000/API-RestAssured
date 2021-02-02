package customerAPI;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerEndpointTests extends BaseTest {

    private CustomerEndPointAPI customerEndPointAPI;

    public CustomerEndPointAPI getCustomerEndPointAPI() {
        return customerEndPointAPI;
    }

    @Test
    public void testCustomerAPI(){
        String URI = "https://api.stripe.com/v1/";
        Map<String,String> testData = new HashMap<String, String>();
        testData.put("email","bolofbaba@gmail.com");
        customerEndPointAPI.postRequestAPI(testData,URI);
    }
}
