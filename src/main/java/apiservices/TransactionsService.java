package apiservices;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TransactionsService {

    public HttpResponse<JsonNode> listAllTransactions(String apiKey) {

        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get("https://private-4399b-fattmerchant.apiary-mock.com/transaction")
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .asJson();
        } catch (UnirestException ex) {
            ex.getMessage();
        }

        return response;
    }

    public HttpResponse<JsonNode> getTransactionInformation(String apiKey, String transactionId) {

        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get("https://private-4399b-fattmerchant.apiary-mock.com/transaction/" + transactionId)
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .asJson();
        } catch (UnirestException ex) {
            ex.getMessage();
        }

        return response;
    }
}
