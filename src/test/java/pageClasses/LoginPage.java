package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    //locators
    @FindBy(xpath="//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    //methods
    public void setloginEmailField(String email)
    {
        emailField.sendKeys(email);
    }

    public void setPasswordField(String password)
    {
        passwordField.sendKeys(password);
    }

    public void clickonLoginButton()
    {
        loginButton.click();
    }



}
