package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SampleAppPage extends PageObject {
    private By usernameField() {
        return By.name("UserName");
    }

    private By passwordField() {
        return By.name("Password");
    }

    private By loginButton() {
        return By.id("login");
    }

    private By loginStatus() {
        return By.id("loginstatus");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnSampleApp() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void loginStatusDisplayed() {
        $(loginStatus()).isDisplayed();
    }
}
