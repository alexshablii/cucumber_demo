package api;

import apiservices.TransactionsService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GetTransactionInfoStepdefs {

    private String transactionId;
    private HttpResponse<JsonNode> response;

    @Given("a transaction Id")
    public void aTransactionId() {
        transactionId = "6f49149d-69a1-48e6-bec5-d63eb5816118";
    }

    @When("the GET request is made")
    public void theGETRequestIsMade() {
        TransactionsService transactionsService = new TransactionsService();
        response = transactionsService.getTransactionInformation("AlexS-db2d439b87fd", transactionId);
    }

    @Then("the status is {int}")
    public void theStatusIs(int expectedStatus) {
        Assert.assertEquals(response.getStatus(), expectedStatus);
    }

    @And("the payment method is {string}")
    public void thePaymentMethodIs(String expectedPaymentMethod) {
        String nickname = response.getBody().getObject().getJSONObject("payment_method").getString("nickname");
        System.out.println("NICKNAME: " + nickname);
        Assert.assertTrue(nickname.contains(expectedPaymentMethod));
    }
}
