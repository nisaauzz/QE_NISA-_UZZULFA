package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected string url = "https://jsonplaceholder.typicode.com/posts";

    @Steps("I set POST api endpoint")
    public String setPOSTApiEndpoint() {
        return url + "users";
    }


    @Steps("I send POST HTTP request")
    public void sendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","morpheus");
        requestBody.put("name","leader");

        SerenityRest.given().header( s: "Content-Type", o: "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Steps("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201() {
        restAssuredThat(respon -> response.statusCode(201));
    }

    @Steps("I receive valid data for new user")
    public void validateDatanewuser() {
        restAssuredThat(response -> response.body( s: "'name'", equalTo( operand: "morpheus")));
        restAssuredThat(response -> response.body( s: "'job'", equalTo( operand: "leader")));
    }
}
