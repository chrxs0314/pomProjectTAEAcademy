package pomProjectTAEAcademy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pomProjectTAEAcademy.Providers.DataProviderLogin;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ProductsPage extends BasePage{
    DataProviderLogin dataProviderLogin = new DataProviderLogin();
    @FindBy(className = "btn_inventory")
    private List<WebElement> addCartBtn;
    @FindBy(className = "inventory_item")
    private List<WebElement> products;
    @FindBy(className = "shopping_cart_link")
    private WebElement cartBtn;

    Random r = new Random();

    private Set<Integer> addedProductsIndex = new HashSet<>();

    public void addProducts() {
        int productsAddSize = r.nextInt(6) + 1;
        if (!products.isEmpty()) {
            for (int i = 0; i < productsAddSize; i++) {
                int randomIndex;

                do {
                    randomIndex = r.nextInt(products.size());
                } while (addedProductsIndex.contains(randomIndex));

                WebElement producto = addCartBtn.get(randomIndex);
                producto.click();

                addedProductsIndex.add(randomIndex);
            }
        }
    }

    public void openShoppingCart(){
        cartBtn.click();
    }

    public ProductsPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
