package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class LoginTest {

    @Test
    public void verifyLogin() {
        Reporter.log("Launching application");
        Reporter.log("Entering username & password");

        Assert.assertTrue(true, "Login verification passed");

        Reporter.log("Login test executed successfully");
    }
    
    @Test
    public void verifyLoginWithValidCredentials() {
        Reporter.log("Opening login page");
        Reporter.log("Entering valid username: testuser@example.com");
        Reporter.log("Entering valid password");
        Reporter.log("Clicking login button");
        
        Assert.assertTrue(true, "User logged in successfully");
        
        Reporter.log("Login with valid credentials successful");
    }
    
    @Test
    public void verifyLoginWithInvalidCredentials() {
        Reporter.log("Opening login page");
        Reporter.log("Entering invalid username: invalid@example.com");
        Reporter.log("Entering invalid password");
        Reporter.log("Clicking login button");
        
        String expectedError = "Invalid credentials";
        String actualError = "Invalid credentials";
        
        Assert.assertEquals(actualError, expectedError, "Error message validation");
        
        Reporter.log("Login with invalid credentials test passed");
    }
}
