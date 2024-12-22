package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InventoryPage {
    private final WebDriver driver;

    // Selectors
    private final By checkbox = By.cssSelector("body.pace-done:nth-child(2) div.content div.gray-bg div.wrapper.wrapper-content:nth-child(3) div.row:nth-child(2) div.col-lg-12 div.ibox div.ibox-content div.react-grid-Container:nth-child(3) div.react-grid-Main div.react-grid-Grid div.react-grid-Viewport div.react-grid-Canvas div.react-grid-Row.react-grid-Row--even div.rdg-row-actions-cell.react-grid-Cell.react-grid-Cell--frozen:nth-child(4) div.react-grid-Cell__value div:nth-child(1) span:nth-child(1) div.react-grid-checkbox-container > label.react-grid-checkbox-label");
    private final By adjustmentButton = By.xpath("//button[@class='ladda-button btn btn-primary m-l-xs']//span[text()='Penyesuaian Persediaan']");
    private final By inputField1 = By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div");
    private final By inputField2 = By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[6]/div");
    private final By typeField = By.xpath("//*[@id=\"page-top\"]/div[5]/div/input");
    private final By saveButton = By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div/button");

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(inputField1)); // Tunggu elemen bisa diklik

        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(inputField1)).perform();
        driver.findElement(typeField).sendKeys(value);
    }

    public void enterSecondValue(String value) {
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(inputField2)).perform();
        driver.findElement(typeField).sendKeys(value);
    }

    public void clickSaveButton() {
        // Scroll the button into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(saveButton));
        driver.findElement(saveButton).click();
    }
}
