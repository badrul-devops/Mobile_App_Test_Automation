package pages;

import io.appium.java_client.AppiumDriver;
import pages.AdditionPage.TestingApp;

public class PageObjectManager {

    public static AppiumDriver driver;
    public TestingApp testingApp;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public TestingApp getAdditionPage() {
        testingApp = new TestingApp(driver);
        return testingApp;
    }

}
