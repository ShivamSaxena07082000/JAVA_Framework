package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    //Constructor
    public RegistrationPage(WebDriver driver)
    {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement  firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement  lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement  emailInput;
    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement  telephoneInput;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement  passwordInput;
    @FindBy(xpath = "//input[@name='confirm']")
    private WebElement  confirmInput;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement submitButton;


    //methods

    public void setFirstNameInput(String firstName)
    {
        firstNameInput.sendKeys(firstName);
    }
    public void setLastNameInput(String lastName)
    {
        lastNameInput.sendKeys(lastName);
    }
    public void setEmailInput(String email)
    {
        emailInput.sendKeys(email);
    }
    public void setTelephoneInput(String telephone)
    {
        telephoneInput.sendKeys(telephone);
    }
    public void setPasswordInput(String password)
    {
        passwordInput.sendKeys(password);
    }
    public void setConfirmInput(String confirmPassword)
    {
        confirmInput.sendKeys(confirmPassword);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }



}
