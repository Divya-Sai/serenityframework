package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashBoardPage;
import starter.pages.LoginPage;

public class LoginToApplicationSteps {

    @Steps
    LoginPage logPag;

    @Steps
    DashBoardPage DashPag;

    @Given("Launch Chrome Browser")
    public void launch_chrome_browser() {
        logPag.openApplication();
    }

    @When("User enter username and password")
    public void user_enter_username_and_password() throws InterruptedException {
        logPag.enterUserName();
        logPag.enterUserPassword();
    }

    @Then("Click on Login Button")
    public void click_on_login_button() throws InterruptedException {
        logPag.clickOnLogin();
    }

    @Then("Verify the title of the page")
    public void verify_the_title_of_the_page() throws InterruptedException {
        DashPag.verifyTitle();

    }
}
