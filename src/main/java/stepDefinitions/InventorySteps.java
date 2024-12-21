package stepDefinitions;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import pages.LoginPage;

public class InventorySteps extends env_target {
    private InventoryPage inventoryPage;

    @Given("user logs into the system")
    public void user_logs_into_the_system() {
        setUp();
        driver.get(baseUrl + "login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("zikrikholifah898@gmail.com");
        loginPage.enterPassword("Aiki@12345");
        loginPage.clickLoginButton();
    }

    @When("user navigates to the inventory page")
    public void user_navigates_to_the_inventory_page() {
        driver.get(baseUrl + "home/inventory");
        inventoryPage = new InventoryPage(driver);
    }

    @And("user selects an inventory item")
    public void user_selects_an_inventory_item() {
        inventoryPage.selectFirstCheckbox();
    }

    @And("user clicks the adjustment button")
    public void user_clicks_the_adjustment_button() {
        inventoryPage.clickAdjustmentButton();
    }

    @And("user inputs {string} for the first value")
    public void user_inputs_first_value(String value) {
        inventoryPage.enterFirstValue(value);
    }

    @And("user inputs {string} for the second value")
    public void user_inputs_second_value(String value) {
        inventoryPage.enterSecondValue(value);
    }

    @And("user saves the adjustment")
    public void user_saves_the_adjustment() {
        inventoryPage.clickSaveButton();
    }

    @Then("the inventory adjustment is saved successfully")
    public void inventory_adjustment_is_saved_successfully() {
        tearDown();
    }
}
