package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {

    WebDriver driver;
    public  GenericUtils(WebDriver driver){this.driver=driver;}

    public  void SwitchWindoToChild(){
        Set<String> windows=driver.getWindowHandles();
        String Currenturl=driver.getCurrentUrl();
        Iterator<String> it=windows.iterator();
        String parentwindow=it.next();
        String childwindow=it.next();
        driver.switchTo().window(childwindow);
    }
}
