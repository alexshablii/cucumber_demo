package ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.AboutUsPage;
import pageobjects.HomePage;
import pageobjects.Menu;


public class MeetLeadershipTeamStepdefs {

    private WebDriver driver;

    private HomePage homePage;
    private AboutUsPage aboutUsPage;
    private Menu menu;

    @Given("a user opens fattmerchant.com")
    public void aUserOpensFattmerchantCom() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://fattmerchant.com/");

        homePage = new HomePage(driver);
        homePage.waitForPageLoaded();
    }

    @When("the user clicks the About Us link")
    public void theUserClicksTheAboutUsLink() {

        menu = new Menu(driver);
        menu.goToAboutUsPage();
    }

    @Then("the user is redirected to the about-us page")
    public void theUserIsRedirectedToTheAboutUsPage() {

        aboutUsPage = new AboutUsPage(driver);
        Assert.assertEquals(aboutUsPage.getHeader(), "Meet Fattmerchant");
    }

    @And("the user can meet the Fattmerchant Leadership Team")
    public void theUserCanMeetTheFattmerchantLeadershipTeam() {
        Assert.assertEquals(aboutUsPage.getLeadershipTeam(), 4);

        driver.quit();
    }
}
