package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
