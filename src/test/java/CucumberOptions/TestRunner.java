package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src\\test\\java\\Features",glue = "StepDefinitions",monochrome = true,
                    tags ="@SmokeTest",plugin ={"html:target/cucubmer.html", "json:target/cucubmer.json",
                     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} )

public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){return super.scenarios();}





}
