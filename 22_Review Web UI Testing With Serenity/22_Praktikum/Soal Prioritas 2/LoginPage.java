package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObject {

    getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    private By usernameField() {
        return By.id("user-name");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginBtn() {
        return By.id("login-button");
    }

    @Step
    public void onLoginPage() throws InterruptedException {
        open();
        $(loginBtn()).shouldBeVisible();
        Thread.sleep(10000);
    }

    @Step
    public void inputUserName(String username) throws InterruptedException {
        $(usernameField()).type(username);
        Thread.sleep(10000);
    }

    @Step
    public void inputPassword(String password) throws InterruptedException {
        $(passwordField()).type(password);
        Thread.sleep(10000);
    }

    @Step
    public void clickLoginButton(){
        $(loginBtn()).click();
        Thread.sleep(10000);
    }
}
