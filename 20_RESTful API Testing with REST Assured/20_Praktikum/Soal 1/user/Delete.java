package starter.user;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set DELETE api endpoint")
    public String setDeleteApiEndpoint() {
        return url + "users/2";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(SetDeleteApiEndpoint)() {
        }
    @Step("I receive valid HTTP response code 204");
    public void validateHttpResponse204() {
        restAssuredThat(response -> response.statusCode(204));
        }
}
