package pomProjectTAEAcademy.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pomProjectTAEAcademy.Pages.CartPage;
import pomProjectTAEAcademy.Pages.CheckoutPage;
import pomProjectTAEAcademy.Pages.LoginPage;
import pomProjectTAEAcademy.Pages.ProductsPage;

public class PurchaseProductTest extends BaseTest{
    ProductsPage productsPage;
    CartPage cart;
    CheckoutPage checkout;

    @Test
    public void testPurchase(){
        productsPage = getProductsPage();
        productsPage.addProducts();
        productsPage.openShoppingCart();

        cart = getCartPage();
        cart.checkout();

        checkout = getCheckOut();
        checkout.checkoutProducts();
    }
}
