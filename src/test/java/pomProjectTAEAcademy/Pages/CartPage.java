package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(className = "checkout_button")
    private WebElement checkoutBtn;

    public void checkout(){
        checkoutBtn.click();
    }

    public CartPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
