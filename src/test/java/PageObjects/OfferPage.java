package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    public WebDriver driver;


    //Constructor
    public OfferPage(WebDriver driver){this.driver=driver;}

    By search= By.xpath("//input[@type='search']");
    By ProductName=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/table/tbody/tr/td[1]");


    public void SearchingProduct(String name){driver.findElement(search).sendKeys(name);}

    public void GetSearchText(){driver.findElement(search).getText();}

    public String GetprodName() {return driver.findElement(ProductName).getText();}




}
