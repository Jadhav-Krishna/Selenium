package registration_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void launchApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/HCL/Selenium/form.html");
    }

    @AfterMethod
    public void closeApp() {
        driver.quit();
    }
}
