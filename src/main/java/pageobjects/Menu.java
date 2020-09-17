package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu extends BasePageObject {

    private By aboutUs = By.xpath("//span[text()='About Us']");

    public Menu(WebDriver driver) {
        super(driver);
    }

    public void goToAboutUsPage() {
        waitForVisibilityOf(aboutUs);
        click(aboutUs);
    }
}
