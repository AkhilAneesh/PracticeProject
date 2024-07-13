package StepDefinitions;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;

public class Hooks {
    public TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @After
    public void teardown() throws IOException {
        testContextSetup.testBase.WebDriverManager().quit();
    }


    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = testContextSetup.testBase.WebDriverManager();
        if (scenario.isFailed()) {
            File sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
            scenario.attach(filecontent, "image/png", "image1");
        }
    }
}
