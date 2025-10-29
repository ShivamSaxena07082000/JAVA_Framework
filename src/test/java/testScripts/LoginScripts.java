package testScripts;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class LoginScripts extends BaseTest {

    @Test
    public void loginTest()
    {
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickonMyAccountTab();
        homePageObj.clickonLoginLink();

        LoginPage loginPageObj = new LoginPage(driver);
        loginPageObj.setloginEmailField("shivamsaxena0256@gmail.com");
        loginPageObj.setPasswordField("Password123");
        loginPageObj.clickonLoginButton();

    }
}
