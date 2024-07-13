package StepDefinitions;

import PageObjects.Checkoutpage;
import PageObjects.Landingpage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.sql.SQLOutput;

public class LandingPageGreenKartStepDef {

    public WebDriver driver;

    public String ProductLandingpage; //optional


    TestContextSetup testContextSetup;
    Landingpage landingpage;
    Checkoutpage checkoutpage;


    public LandingPageGreenKartStepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.landingpage = testContextSetup.pageObjectManager.getLandingpage();
        this.checkoutpage = testContextSetup.pageObjectManager.getCheckoutpage();


    }


    @Given("User on the Green Kart home page")
    public void user_on_the_green_kart_home_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(landingpage.getTitlelandingpage().contains("Green"));


    }

    @When("^user searches the prod short name (.+) on the home page product search section and extract the text shown$")
    public void user_searches_the_prod_short_name_tom_on_the_home_page_product_search_section_and_extract_the_text_shown(String prod) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        landingpage.SearchingProduct(prod);
        Thread.sleep(1000);
        testContextSetup.ProductLandingpage = landingpage.GetprodName().split("-")[0].trim();
        System.out.println(ProductLandingpage);
    }

    @When("user add the product to cart with quantity {string}")
    public void user_add_the_product_to_cart_with_quantity(String qty) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        checkoutpage.AddProductQty(Integer.parseInt(qty));
        checkoutpage.AddToCart();

    }

}
