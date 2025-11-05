package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver)
    {

        super(driver);
    }

    //locators
    @FindBy(xpath="//h2[text()='My Account']")
    private WebElement myAccountText;

    //methods
    public boolean isLandingPageIsDisplayed()
    {
        try
        {
            return myAccountText.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }

    }





}
