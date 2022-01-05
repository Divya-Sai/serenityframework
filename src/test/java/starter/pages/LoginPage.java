package starter.pages;

import net.thucydides.core.annotations.Step;

public class LoginPage {

     nopCOmmereceLoginPage nopCommLogin;

    @Step
    public void openApplication(){
        nopCommLogin.open();
    }

    @Step
    public void enterUserName(){
        nopCommLogin.enterUserName();
    }

    @Step
    public void enterUserPassword(){
        nopCommLogin.enterPassword();
    }

    @Step
    public void clickOnLogin() {
        nopCommLogin.clickLoginButton();
    }
}
