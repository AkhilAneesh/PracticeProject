package StepDefinitions;

import PageObjects.Landingpage;
import PageObjects.OfferPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OfferPageGreenKartStepDef {
    public WebDriver driver;

    TestContextSetup testContextSetup;
    OfferPage offerPage;
    Landingpage landingpage;


    public OfferPageGreenKartStepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.offerPage = testContextSetup.pageObjectManager.getOfferPage();
        this.landingpage = testContextSetup.pageObjectManager.getLandingpage();

    }

    @Then("^user searches for the prod on offer zone (.+) and extracting the text from offer zone page$")
    public void user_searches_for_the_prod_on_offer_zone_tom_and_extracting_the_text_from_offer_zone_page(String prod) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        SwitchToOfferpage();
        offerPage.SearchingProduct(prod);
        Thread.sleep(2000);
        testContextSetup.ProductOfferapage = offerPage.GetprodName();
    }

    public void SwitchToOfferpage() {
        Landingpage landingpage = testContextSetup.pageObjectManager.getLandingpage();
        landingpage.SelectTopDealpage();
        testContextSetup.genericUtils.SwitchWindoToChild();
    }

    @Then("Validate the text extracted from the home page adn offer zone page")
    public void validate_the_text_extracted_from_the_home_page_adn_offer_zone_page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(testContextSetup.ProductOfferapage, testContextSetup.ProductLandingpage);
    }
}
