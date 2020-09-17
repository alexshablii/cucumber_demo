package api;

import apiservices.AuthService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class GenerateTokenStepdefs {

    private String apiKey;
    private HttpResponse<JsonNode> response;

    @Given("a valid api key")
    public void aValidApiKey() {
        System.out.println("a valid api key");
        apiKey = "AlexS-db2d439b87fd";
    }

    @When("a GET request is made")
    public void aGETRequestIsMade() {
        System.out.println("a GET request is made");
        AuthService authService = new AuthService();
        response = authService.generateToken(apiKey);
    }

    @Then("the response status is {int}")
    public void theResponseStatusIs(int expectedStatus) {
        System.out.println("the response status is " + response.getStatus());
        Assert.assertEquals(response.getStatus(), expectedStatus);
    }

    @And("the response body contains {string}")
    public void theResponseBodyContains(String expectedBody) {
        System.out.println("the response body contains " + response.getBody().getObject().getString(expectedBody));
        Assert.assertFalse(response.getBody().getObject().getString(expectedBody).isBlank());
    }
}
