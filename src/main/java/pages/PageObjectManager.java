package pages;

import io.appium.java_client.AppiumDriver;
import pages.AdditionPage.AdditionPage;

public class PageObjectManager {

    public static AppiumDriver driver;
    public AdditionPage additionPage;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public AdditionPage getAdditionPage() {
        additionPage = new AdditionPage(driver);
        return additionPage;
    }

}
