package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    //Constructor
    public WebDriver driver;
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountTab;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerLink;


    //methods
    public void clickonMyAccountTab()
    {
        myAccountTab.click();
    }

    public void clickonRegisterLink()
    {
        registerLink.click();
    }



}
