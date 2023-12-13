package pomProjectTAEAcademy.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pomProjectTAEAcademy.Pages.LoginPage;

public class LoginTest extends BaseTest{

    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage;

    @Test
    public void testLogin(){
        loginPage = getLoginPage();
        loginPage.login();
    }
}
