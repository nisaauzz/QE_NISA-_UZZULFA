package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;

public class LoginSteps {

    @Steps
    LoginScreen loginScreen;

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Assert.assertTrue(loginScreen.isOnLoginPage());
    }
    @When("user input {string} on email field")
    public void inputEmail(String email) {
        loginScreen.inputEmail(email);
    }

    @And("user input {string} on password field")
    public void inputPassword(String password) {
        loginScreen.inputPassword(password);
    }

    @And("user click login button")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        Assert.assertEquals(message, loginScreen.getErrorMessage());
    }

    @Then("user see home page")
    public void userSeeHomePage() {
        Assert.assertTrue(loginScreen.homePage());
    }
}