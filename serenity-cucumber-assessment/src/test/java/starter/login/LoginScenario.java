package starter.login;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import org.junit.Assert;
import starter.navigation.LoginPage;

public class LoginScenario {
    LoginPage LoginPage;

    public void onLoginPage(){
        LoginPage.open();
    }

    public void enterCredentials(String username, String password){
        LoginPage.enterUsername(username);
        LoginPage.enterPassword(password);
    }

    public void clickLogin(){
        LoginPage.clickLoginBtn();
    }

    public void verifySuccessfulLogin(){
        Assert.assertEquals("Logged In Successfully", LoginPage.getHomePageTitle());
    }
}
