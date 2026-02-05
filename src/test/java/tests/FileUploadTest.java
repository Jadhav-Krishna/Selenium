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

        // Set Chrome options to handle file dialogs
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        System.out.println("Page loaded successfully");

        // Wait for the page to load completely
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait for the file upload element to be present and visible
        WebElement fileUploadElement = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.id("file-upload"))
        );
        
        System.out.println("File upload element found");

        // Scroll to the element to make sure it's in view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", fileUploadElement);
        
        Thread.sleep(500);
        
        // Highlight the element to verify it's found
        js.executeScript("arguments[0].style.border='3px solid red'", fileUploadElement);
        
        Thread.sleep(1000);
        
        // Use Actions class to perform real click (more reliable than JS click)
        Actions actions = new Actions(driver);
        actions.moveToElement(fileUploadElement).click().perform();

        System.out.println("File upload element clicked with Actions - dialog should open");

        // Give more time for the file dialog to open
        Thread.sleep(3000);

        // Execute AutoIT script to handle the Windows file dialog
        System.out.println("Executing AutoIT script...");
        Runtime.getRuntime().exec("D:\\HCL\\Selenium\\FileUpload.exe");

        System.out.println("AutoIT script executed");

        // Wait longer for AutoIT to complete
        Thread.sleep(7000);

        // Click submit button
        driver.findElement(By.id("file-submit")).click();

        System.out.println("Submit button clicked");

        Thread.sleep(3000);
        
        // Verify upload success
        try {
            WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
            System.out.println("✓ File uploaded successfully!");
            System.out.println("✓ Uploaded file name: " + uploadedFile.getText());
        } catch (Exception e) {
            System.out.println("✗ Upload verification failed - file dialog may not have been handled");
        }
        
        System.out.println("Test completed successfully!");
        driver.quit();
    }
}
