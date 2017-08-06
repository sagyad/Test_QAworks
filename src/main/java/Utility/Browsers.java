package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Owner on 11/07/2017.
 */
public class Browsers {

    public static WebDriver firefoxdriver;
    public static WebDriver chromedriver;
    public static WebDriver htmldriver;

    public enum BrowserType {FIREFOX, CHROME, HTMLUNIT}

    public static WebDriver driver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                if (chromedriver == null) {
                    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
                    chromedriver = new ChromeDriver();
                }
                return chromedriver;
            case HTMLUNIT:
                if (htmldriver == null) {
                    htmldriver = new HtmlUnitDriver();
                }
                return htmldriver;
            default:
                if (firefoxdriver == null) {
                    firefoxdriver = new FirefoxDriver();
                }
                return firefoxdriver;
        }

    }
}
