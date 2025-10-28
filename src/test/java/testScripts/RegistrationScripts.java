package testScripts;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.RegistrationPage;

public class RegistrationScripts extends BaseTest {

    @Test
    public void registrationTest() {
        // Code to perform registration test
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickonMyAccountTab();
        homePageObj.clickonRegisterLink();

        RegistrationPage registerobj = new RegistrationPage(driver);
        registerobj.setFirstNameInput("Shivam");
        registerobj.setLastNameInput("Saxena");
        registerobj.setEmailInput("shivamsaxena0256@gmail.com");
        registerobj.setTelephoneInput("9876543210");
        registerobj.setPasswordInput("Password123");
        registerobj.setConfirmInput("Password123");
        registerobj.clickSubmitButton();

    }

}

