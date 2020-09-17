package apiservices;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class AuthService {

    public HttpResponse<JsonNode> generateToken(String apiKey) {

        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get("https://private-4399b-fattmerchant.apiary-mock.com/ephemeral")
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .asJson();
        } catch (UnirestException ex) {
            ex.getMessage();
        }

        return response;
    }
}
