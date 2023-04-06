package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SampleAppPage;

public class SampleAppSteps {
    @Steps
    SampleAppPage sampleAppPage;

    @Given("I am on the Sample App page")
    public void onTheSampleApp() {
        sampleAppPage.openPage();
        sampleAppPage.validateOnSampleApp();
    }
    @When("I input any username")
    public void inputAnyUsername() {
        sampleAppPage.inputUserName("Rifki");
    }
    @And("I input valid password")
    public void inputValidPassword() {
        sampleAppPage.inputPassword("pwd");
    }
    @And("I click login button")
    public void clickLoginButton() {
        sampleAppPage.clickLoginButton();
    }
    @Then("I see the welcome sign")
    public void seeWelcomeSign() {
        sampleAppPage.loginStatusDisplayed();
    }
}
