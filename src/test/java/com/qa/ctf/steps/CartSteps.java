package com.qa.ctf.steps;

import com.qa.ctf.context.TestContext;
import com.qa.ctf.data.Product;
import com.qa.ctf.pages.CartPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartSteps extends BaseSteps {

    private final CartPage cartPage;

    public CartSteps(TestContext testContext) {
        super(testContext);
        this.cartPage = pageFactory.getCartPage(testContext);
    }

    @Then("I should see {int} {product} in the cart")
    public void i_should_see_in_the_cart(Integer quantity, Product product) {
        Assert.assertEquals(product.getProductName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }

//    @Given("I'm on the checkout page")
//    public void i_m_on_the_checkout_page() {
//        //cartPage.checkout();
//    }

}
