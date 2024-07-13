package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {

    public WebDriver driver;

    public Checkoutpage(WebDriver driver){
        this.driver=driver;
    }

    By addbutton= By.linkText("+");
    By AddtoCartButton=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button");
    By CartImage=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");

    By ProceedToCheckout=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
    By ApplyButton= By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button");

    By PromoButton=By.cssSelector(".promoBtn");
    By PlaceHolder =By.xpath("//button[contains(text(),'Place Order')]");


    public void AddProductQty(int num){
        for(int i=0;i<num;i++){
            driver.findElement(addbutton).click();
        }
    }

    public void AddToCart() throws InterruptedException {
        driver.findElement(AddtoCartButton).click();
        Thread.sleep(2000);
        driver.findElement(CartImage).click();
        Thread.sleep(2000);

    }

    public void ProceedCheckout(){
        driver.findElement(ProceedToCheckout).click();
    }

    public boolean CheckPromoButton(){
        return driver.findElement(PromoButton).isDisplayed();
    }

    public boolean CheckPlaceHolder(){
        return driver.findElement(PlaceHolder).isDisplayed();
    }


}
