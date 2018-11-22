package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
static WebDriver driver;
    
    public static WebDriver startBrowser(String browserName,String url){
        if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "/home/ucreate-71/eclipse-workspace/Maventest/Drivers");
            driver=(WebDriver) new FirefoxDriver();
        }
        else if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
            driver=(WebDriver) new ChromeDriver();
            /*
            ChromeOptions options = new ChromeOptions();
            options.addArguments("window-size=1400,800");
            options.addArguments("headless");
            driver = new ChromeDriver(options);*/
        }        
    
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
