package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class nopCOmmereceLoginPage  extends PageObject {

    public void enterUserName(){
        $(By.id("Email")).clear();
        $(By.id("Email")).type("admin@yourstore.com");

    }
    public void enterPassword(){
        $(By.id("Password")).clear();
        $(By.id("Password")).type("admin");
    }

    public void clickLoginButton(){
        $(By.xpath(".//button[@type='submit']")).click();
    }
}
