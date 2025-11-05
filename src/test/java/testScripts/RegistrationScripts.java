package testScripts;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.RegistrationPage;

import java.time.Duration;

public class RegistrationScripts extends BaseTest {

    @Test
    public void registrationTest() {
        // Code to perform registration test

        logger.info("Doing a Registration");
        HomePage homePageObj = new HomePage(driver);
        logger.debug("Click on MyAccount Tab");
        homePageObj.clickonMyAccountTab();
        logger.debug("Click on Register Link");
        homePageObj.clickonRegisterLink();

        RegistrationPage registerobj = new RegistrationPage(driver);
        registerobj.setFirstNameInput("Shivam");
        registerobj.setLastNameInput("Saxena");
        registerobj.setEmailInput("shivamsaxena0256@gmail.com");
        registerobj.setTelephoneInput("9876543210");
        registerobj.setPasswordInput("Password123");
        registerobj.setConfirmInput("Password123");
        registerobj.checkPrivacyPolicy();

        logger.info("Entered all the details for Registration");
        registerobj.clickSubmitButton();


    }

}

