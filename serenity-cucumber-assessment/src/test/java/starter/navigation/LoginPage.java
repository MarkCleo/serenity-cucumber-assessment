package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://practicetestautomation.com/practice-test-login")
public class LoginPage extends PageObject {
    @FindBy(id = "username")
    WebElementFacade username;
    @FindBy(id = "password")
    WebElementFacade password;
    @FindBy(id = "submit")
    WebElementFacade loginBtn;
    @FindBy(className = "post-title")
    WebElementFacade homePageTitle;

    public void enterUsername(String username){
        this.username.type(username);
    }
    public void enterPassword(String password){
        this.password.type(password);
    }
    public void clickLoginBtn(){
        this.loginBtn.click();
    }
    public String getHomePageTitle(){
        return this.homePageTitle.getText();
    }
}
