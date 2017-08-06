package qaWorks;

import Pages.ContactUsPage;
import Utility.Browsers;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by Owner on 03/08/2017.
 */
public class contactUs_StepDef {
    WebDriver driver = null;
    ContactUsPage contactUsPage = null;


    @Given("^I am QAWorks Site$")
    public void i_am_QAWorks_Site() throws Throwable {
        driver = Browsers.driver(Browsers.BrowserType.CHROME);
        driver.manage().window().maximize();
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.launchQAWorks();
    }

    @Given("^I click on Contact$")
    public void i_click_on_Contact() throws Throwable {
        contactUsPage.clickOnContactUs();
    }


    @Given("^I enter name as \"([^\"]*)\"$")
    public void i_enter_name_as(String name) throws Throwable {
        contactUsPage.enterUserName(name);
    }

    @Given("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String email) throws Throwable {
        contactUsPage.enterEmail(email);
    }

    @Given("^I enter my message as \"([^\"]*)\"$")
    public void i_enter_my_message_as(String message) throws Throwable {
        contactUsPage.enterMessage(message);
    }

    @When("^I click on Send button$")
    public void i_click_on_Send_button() throws Throwable {
        contactUsPage.clickOnSendButton();
    }


    @Then("^I should get confirmation message$")
    public void i_should_get_confirmation_message() throws Throwable {
        System.out.println("Message successfully sent.");
        contactUsPage.closeBrowser();
    }

}
