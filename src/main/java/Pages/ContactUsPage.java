package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Owner on 03/08/2017.
 */
public class ContactUsPage {

    @FindBy(xpath = ".//*[@id='menu']/li[1]/a")
    public WebElement contactUsClick;

    @FindBy(id = "ctl00_MainContent_NameBox")
    public WebElement name;

    @FindBy(id = "ctl00_MainContent_EmailBox")
    public WebElement email;

    @FindBy(id = "ctl00_MainContent_MessageBox")
    public WebElement message;

    @FindBy(id = "ctl00_MainContent_SendButton")
    public WebElement send;

    public static String QAWORKS_URL = "http://qaworks.com/";
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launchQAWorks() {
        driver.get(QAWORKS_URL);
    }

    public void clickOnContactUs() {
        contactUsClick.click();
    }

    public String enterUserName(String entersName) {
        name.sendKeys(entersName);
        return entersName;
    }

    public String enterEmail(String entersEmail) {
        email.sendKeys(entersEmail);
        return entersEmail;
    }

    public String enterMessage(String entersMessage) {
        message.sendKeys(entersMessage);
        return entersMessage;
    }

    public void clickOnSendButton() {
        send.click();
    }

    public void closeBrowser(){
        driver.close();
    }

}
