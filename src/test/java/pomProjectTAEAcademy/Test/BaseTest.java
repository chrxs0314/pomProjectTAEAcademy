package pomProjectTAEAcademy.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        this.driver = new ChromeDriver();
    }

}
