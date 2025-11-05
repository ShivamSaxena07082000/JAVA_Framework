package testScripts;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.LandingPage;
import pageClasses.LoginPage;

public class LoginScripts extends BaseTest {

    @Test
    public void loginTest()
    {
        logger.info("Starting Login Test..");
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickonMyAccountTab();
        homePageObj.clickonLoginLink();

        LoginPage loginPageObj = new LoginPage(driver);
        loginPageObj.setloginEmailField(propObj.getProperty("username"));
        loginPageObj.setPasswordField(propObj.getProperty("password"));
        loginPageObj.clickonLoginButton();

        //page verifications
        LandingPage landingPageObj = new LandingPage(driver);
        boolean isLoggedIn = landingPageObj.isLandingPageIsDisplayed();
        Assert.assertTrue(isLoggedIn,"Not Logged in successfully");


    }
}
