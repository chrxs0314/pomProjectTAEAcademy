package pomProjectTAEAcademy.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pomProjectTAEAcademy.Pages.LoginPage;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        this.driver = new ChromeDriver();
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver, "https://www.saucedemo.com/");
    }

    @AfterTest
    public void tearDown(){
//        driver.close();
    }

}
