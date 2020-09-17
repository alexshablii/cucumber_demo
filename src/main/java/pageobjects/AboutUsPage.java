package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutUsPage extends BasePageObject {

    private By header = By.xpath("//div[@class='wpb_wrapper']/h1");
    private By meetLeaderships = By.xpath("//h2[text()='Meet the Fattmerchant Leadership Team']");

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public int getLeadershipTeam() {
        waitForVisibilityOf(meetLeaderships);
        List<WebElement> leaderships = driver.findElements(By.xpath("//div[@class='w-person-image']"));
        return leaderships.size();
    }

    public String getHeader() {
        waitForVisibilityOf(header);
        return getText(header);
    }
}
