package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src/test/resources/global.properties");
        prop.load(fis);
       // FileInputStream fis=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\GreenKartCucubmerBDD\\src\\test\\resources\\global.properties");
        //prop.load(fis);

        String url=prop.getProperty("QA_url");
        String browser=prop.getProperty("browser");

        if(driver==null){
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
                driver=new ChromeDriver();
            }
            if(browser.equalsIgnoreCase("edge")){
                System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//src/test/resources/msedgedriver.exe");
                driver=new EdgeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(url);


        }
        return  driver;

    }


}
