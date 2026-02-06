package authenticationPopupHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpTest {
	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("D:\\HCL\\Selenium\\src\\test\\java\\authenticationPopupHandling\\AuthPopUp.exe");
		Thread.sleep(1000);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(7000);
		driver.quit();
	}
}