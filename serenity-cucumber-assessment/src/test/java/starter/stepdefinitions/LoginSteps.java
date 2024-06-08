package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.login.LoginScenario;

public class LoginSteps {
    @Steps
    LoginScenario loginScenario;

    @Given("I am in the Login Page")
    public void onLoginPage(){
        loginScenario.onLoginPage();
    }

    @When("I enter valid credentials")
    public void enterCredentials(){
        loginScenario.enterCredentials("student","Password123");
    }

    @And("I click the submit button")
    public void clickSubmitButton(){
        loginScenario.clickLogin();
    }

    @Then("I should be able to login")
    public void verifySuccessfulLogin(){
        loginScenario.verifySuccessfulLogin();
    }
}
