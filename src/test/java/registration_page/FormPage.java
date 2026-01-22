package registration_page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    WebDriver driver;

    // -------- IFRAME --------
    @FindBy(tagName = "iframe")
    WebElement iframe;

    // -------- INPUT FIELDS --------
    @FindBy(name = "text")
    WebElement textField;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "number")
    WebElement number;

    @FindBy(name = "search")
    WebElement search;

    @FindBy(name = "url")
    WebElement url;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(name = "date")
    WebElement date;

    @FindBy(name = "time")
    WebElement time;

    @FindBy(name = "datetime")
    WebElement dateTime;

    @FindBy(name = "month")
    WebElement month;

    @FindBy(name = "week")
    WebElement week;

    // -------- RADIO & CHECKBOX --------
    @FindBy(xpath = "//input[@value='male']")
    WebElement maleRadio;

    @FindBy(xpath = "//input[@value='java']")
    WebElement javaCheckbox;

    // -------- DROPDOWNS --------
    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "course")
    WebElement course;

    // -------- TEXTAREA --------
    @FindBy(name = "message")
    WebElement message;

    // -------- FILE / RANGE / COLOR --------
    @FindBy(name = "file")
    WebElement fileUpload;

    @FindBy(name = "range")
    WebElement range;

    @FindBy(name = "color")
    WebElement color;

    // -------- DATALIST --------
    @FindBy(name = "browser")
    WebElement browser;

    // -------- BUTTON --------
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    // -------- Constructor --------
    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // -------- Actions --------
    public void handleIframe() {
        driver.switchTo().frame(iframe);
        driver.switchTo().defaultContent();
    }

    public void fillForm() {
        textField.sendKeys("Shna");
        password.sendKeys("Test@123");
        email.sendKeys("test@gmail.com");
        number.sendKeys("25");
        search.sendKeys("Selenium");
        url.sendKeys("https://www.google.com");
        phone.sendKeys("9999999999");
        date.sendKeys("2025-01-01");
        time.sendKeys("10:30");
        dateTime.sendKeys("2025-01-01T10:30");
        month.sendKeys("2025-01");
        week.sendKeys("2025-W05");
    }

    public void selectRadioCheckbox() {
        maleRadio.click();
        javaCheckbox.click();
    }

    public void selectDropdowns() {
        new Select(city).selectByVisibleText("Pune");
        new Select(course).selectByVisibleText("Java");
    }

    public void fillTextarea() {
        message.sendKeys("Testing all HTML form elements using Selenium POM");
    }
    
    public void handleExtras() {
        browser.sendKeys("Chrome");

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].value='60';", range);

        color.sendKeys("#ff0000");
    }

    public void submitForm() {
        submit.click();
    }
}

