package utils;

import io.appium.java_client.AppiumDriver;

import pages.PageObjectManager;

public class ContextSetup {

    public AppiumDriver driver;
    public PageObjectManager pageObjectManager;
    public Base base;

    public ContextSetup() throws Exception {
        base = new Base();
       pageObjectManager = new PageObjectManager(base.AppiumDriverManager());

    }

}
