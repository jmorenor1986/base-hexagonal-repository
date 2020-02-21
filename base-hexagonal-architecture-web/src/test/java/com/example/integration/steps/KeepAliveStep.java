package com.example.integration.steps;

import com.example.integration.common.HttpClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KeepAliveStep {
    @Autowired
    private HttpClient httpClient;

    @When("^call the service keepalive$")
    public void call_the_service_keepalive() {
        final String response = httpClient.get("/v1/keepalive/");
        Assert.assertNotNull(response);
    }

    @Then("^the response data is returned$")
    public void the_response_data_is_returned() {

    }


}
