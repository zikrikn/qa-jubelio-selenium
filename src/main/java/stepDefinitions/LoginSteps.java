package stepDefinitions;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends env_target {
    private LoginPage loginPage;

    @Given("user opens the login page")
    public void user_opens_the_login_page() {
        setUp();
        driver.get(baseUrl + "login");
        loginPage = new LoginPage(driver);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        loginPage.enterEmail("zikrikholifah898@gmail.com");
        loginPage.enterPassword("Aiki@12345");
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user is redirected to the dashboard")
    public void user_is_redirected_to_the_dashboard() {
        tearDown();
    }
}
