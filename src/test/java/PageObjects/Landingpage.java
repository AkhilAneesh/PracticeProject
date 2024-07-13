package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {

    public WebDriver driver;

    //Constructor
    public Landingpage(WebDriver driver){this.driver=driver;}


    By search= By.xpath("//input[@type='search']");
    By prodname=By.cssSelector("h4.product-name");
    By Topdeals=By.linkText("Top Deals");

    public void SearchingProduct(String item){driver.findElement(search).sendKeys(item);}

    public String GetprodName(){return driver.findElement(prodname).getText();}

    public void SelectTopDealpage(){driver.findElement(Topdeals).click();}

    public  String getTitlelandingpage(){return driver.getTitle();}


}
