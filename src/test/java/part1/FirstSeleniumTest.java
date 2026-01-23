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

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
//        driver.close();
    }

    @Test(priority = 1)
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(4000);

        WebElement username =  driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(4000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult,expectedResult,"Dashboard page is not displayed");
    }
    
    @Test(priority = 2)
    public void testLoggingOutOfApplication() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(4000);
		String actualResult = driver.findElement(By.tagName("h5")).getText();
		String expectedResult = "Login";
		Assert.assertEquals(actualResult,expectedResult,"Login page is not displayed");
	}
    
    @Test(priority = 3)
    public void testLoginPageTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertNotEquals(actualTitle, expectedTitle, "Page title is not as expected");
	}
}

//@Dataprovider(name = "loginData");
//@BeforeMethod