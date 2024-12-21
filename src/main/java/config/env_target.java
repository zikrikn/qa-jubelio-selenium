package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class env_target {
    protected WebDriver driver;
    protected String baseUrl = "https://app2.jubelio.com/";

    // Setup method
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/browserDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Teardown method
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}