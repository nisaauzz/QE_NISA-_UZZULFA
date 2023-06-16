package starter.stepdefinitions;

package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET api endpoint")
    public void setGETApiEndpoint() {
        get.setGETApiEndpoint();
    }

    @When("I send GET HTTP request")
    public void sendGETHTTPRequest() {
        get.sendGETHttpRequest();
    }

    @Then("I receive HTTP response code 200")
    public void receiveHTTPResponseCode200() {
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        get.validateDataDetailUser();
    }

    @Given("I set POST api endpoint")
    public void setPOSTApiEndpoint() {
        post.setPOSTApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPOSTHTTPRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHTTP201() {
        post.receiveHTTPResponseCode201();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser() {
        post.validateDataNewUser();
    }

    @Given("I set PUT api endpoint")
    public void setPUTApiEndpoint() {
        put.setPUTApiEndpoint();
    }

    @When("I send PUT HTTP request")
    public void sendPUTHTTPRequest() {
        put.sendPUTHTTPRequest();
    }

    @And("I receive valid data for update user")
    public void ValidateUpdateUser() {
        put.validateUpdateUser();
    }

    @Given("I set DELETE api endpoint")
    public void setDeleteApiEndpoint() {
        delete.setDeleteApiEndpoint();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive HTTP response code 204")
    public void validateHttpResponseCode204() {
        delete.validateHttpResponseCode204();
    }

}
