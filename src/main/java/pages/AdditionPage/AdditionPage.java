package pages.AdditionPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AdditionPage {

    public AppiumDriver driver;
    public AdditionPage additionPage;

    By digit5 = By.id("com.google.android.calculator:id/digit_5");
    By digitAdd = By.id("com.google.android.calculator:id/op_add");
    By digitSub = By.id("com.google.android.calculator:id/op_sub");
    By digit8 = By.id("com.google.android.calculator:id/digit_8");
    By digitEqual = By.id("com.google.android.calculator:id/eq");
    By result = By.className("android.widget.TextView");





    public AdditionPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement getDigit5() {
        return driver.findElement(digit5);
    }

    public WebElement getDigitAdd() {
        return driver.findElement(digitAdd);
    }
    public WebElement getDigitSub() {
        return driver.findElement(digitSub);
    }

    public WebElement getDigit8() {
        return driver.findElement(digit8);
    }

    public WebElement getDigitEqual() {
        return driver.findElement(digitEqual);
    }

    public WebElement getResult() {
        return driver.findElement(result);
    }
}
