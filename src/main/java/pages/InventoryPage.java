package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private final WebDriver driver;

    // Selectors
    private final By checkbox = By.name("checkbox0");
    private final By adjustmentButton = By.xpath("//button[@class='ladda-button btn btn-primary m-l-xs']//span[text()='Penyesuaian Persediaan']");
    private final By inputField1 = By.cssSelector("div.react-grid-Cell:nth-child(2) > div.react-grid-Cell__value");
    private final By inputField2 = By.cssSelector("div:nth-child(13) div.rdg-editor-container > input.editor-main");
    private final By saveButton = By.xpath("//span[contains(text(),'Simpan')]");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void selectFirstCheckbox() {
        driver.findElement(checkbox).click();
    }

    public void clickAdjustmentButton() {
        driver.findElement(adjustmentButton).click();
    }

    public void enterFirstValue(String value) {
        driver.findElement(inputField1).sendKeys(value);
    }

    public void enterSecondValue(String value) {
        driver.findElement(inputField2).sendKeys(value);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }
}
