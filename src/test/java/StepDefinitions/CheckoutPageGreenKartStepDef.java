package StepDefinitions;

import PageObjects.Checkoutpage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutPageGreenKartStepDef {

    public TestContextSetup testContextSetup;
    public Checkoutpage checkoutpage;


    public CheckoutPageGreenKartStepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.checkoutpage = testContextSetup.pageObjectManager.getCheckoutpage();
    }


    @When("user proceed to checkout")
    public void user_proceed_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        checkoutpage.ProceedCheckout();
    }

    @Then("Variefy and Validate the checkout page")
    public void variefy_and_validate_the_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(checkoutpage.CheckPlaceHolder());
        Assert.assertTrue(checkoutpage.CheckPromoButton());
    }

}
