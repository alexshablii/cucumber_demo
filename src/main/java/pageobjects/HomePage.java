package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageObject {

    private By simple = By.xpath("//span[text()='Simple.']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void waitForPageLoaded() {
        waitForVisibilityOf(simple);
    }
}
