package part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TITSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onlinefeestechnocrats.in/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
//        driver.close();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(4000);

        driver.findElement(By.linkText("Online Tuition Fee Payment & No Dues Request")).click();

        WebElement username =  driver.findElement(By.name("Login1$UserName"));
        username.sendKeys("0111cs221112");

        var password = driver.findElement(By.name("Login1$Password"));
        password.sendKeys("19012005");

        driver.findElement(By.name("Login1$LoginButton")).click();

        driver.navigate().refresh();
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        Thread.sleep(4000);

//        String actualResult = driver.findElement(By.id("ctl00_lnkRefund")).getText();
//        String expectedResult = "Refund/Cancellation Policy";
//        Assert.assertEquals(actualResult,expectedResult);
    }
}
