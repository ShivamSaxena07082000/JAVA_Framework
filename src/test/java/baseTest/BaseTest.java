package baseTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public Logger logger;
    public Properties propObj;
    @BeforeClass
    @Parameters({"browser"})
    public void setup(String browser) throws IOException {
        // Code to initialize WebDriver and other setup tasks
        //code to add log4j2

        //load the properties file
        FileReader file = new FileReader(".\\src\\test\\resources\\config.properties");
        propObj = new Properties();
        propObj.load(file);
        logger = LogManager.getLogger(this.getClass());
        switch (browser.toLowerCase()){

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser is not correct");
                break;
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(propObj.getProperty("url"));
        driver.manage().window().maximize();
    }

    //@AfterClass
   // public void tearDown() {
        // Code to close the browser and cleanup
      //  driver.quit();

    //}
}
