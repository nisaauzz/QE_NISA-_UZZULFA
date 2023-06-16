package starter.user;

import com.google.gson.JsonObject;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;

public class Put {

    protected String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set PUT Api endpoint")
    Public String setPutApiendpoint() {
        return url + "users/2";
    }

    @Step("I send PUT HTTP request")
    Public void sendPutHttpRequest() {
        JsonObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "zion resident");

        SerenityRest.given().header( s: "content-Type", o: "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoint());
    }

    @Step("I receive valid data for updated user")
    public void validateUpdateUser() {
        restAssuredThat(response -> response.body ("'name'", equalTo( operand: "morpheus")));
        restAssuredThat(response -> response.body ("'job'", equalTo( operand: "zion resident")));
    }

}
