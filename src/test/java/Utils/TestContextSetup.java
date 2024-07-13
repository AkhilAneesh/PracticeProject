package Utils;

import PageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;

    public String ProductLandingpage;
    public  String ProductOfferapage;



    public  TestContextSetup() throws IOException {
        testBase=new TestBase();
        pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
        genericUtils=new GenericUtils(testBase.WebDriverManager());

    }
}
