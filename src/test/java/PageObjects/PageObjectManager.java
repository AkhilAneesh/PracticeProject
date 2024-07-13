package PageObjects;

import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public Landingpage landingpage;
    public OfferPage offerPage;
    public Checkoutpage checkoutpage;

    public  PageObjectManager(WebDriver driver){this.driver=driver;}

    public Landingpage getLandingpage(){
        landingpage=new Landingpage(driver);
        return  landingpage;
    }

    public OfferPage getOfferPage(){
        offerPage=new OfferPage(driver);
        return offerPage;
    }

    public Checkoutpage getCheckoutpage(){
        checkoutpage=new Checkoutpage(driver);
        return checkoutpage;
    }


}
