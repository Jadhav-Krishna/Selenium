package registration_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    public void launchApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Selenium/form.html");
    }

    public void closeApp() {
        driver.quit();
    }
}

