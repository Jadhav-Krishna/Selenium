package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class FileUploadTest {
    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement fileUploadElement = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.id("file-upload"))
        );
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", fileUploadElement);
        
        Thread.sleep(500);
        
        js.executeScript("arguments[0].style.border='3px solid red'", fileUploadElement);
        
        Thread.sleep(1000);
        
        Actions actions = new Actions(driver);
        actions.moveToElement(fileUploadElement).click().perform();

        Thread.sleep(3000);

        Runtime.getRuntime().exec("D:\\HCL\\Selenium\\FileUpload.exe");

        Thread.sleep(7000);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);
        
        try {
            WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
            System.out.println("Uploaded file name: " + uploadedFile.getText());
        } catch (Exception e) {
            System.out.println("Upload verification failed");
        }
        
        driver.quit();
    }
}
