package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.AdditionPage.AdditionPage;
import utils.ContextSetup;


public class TestSteps {

    AppiumDriver driver;
    AdditionPage additionPage;
    ContextSetup setup;


    public TestSteps(ContextSetup setup){
       this.setup = setup;
       this.additionPage = setup.pageObjectManager.getAdditionPage();
    }


    @Given("Click on two digits and complete add operation")
    public void addition() throws Exception {
        additionPage.getDigit5().click();
        additionPage.getDigitAdd().click();
        additionPage.getDigit8().click();
        additionPage.getDigitEqual().click();
        WebElement result = additionPage.getResult();
        System.out.println("Result is : " + result.getText());
    }

    @Given("Click on two digits and complete sub operation")
    public void subtraction() throws Exception {
        additionPage.getDigit5().click();
        additionPage.getDigitSub().click();
        additionPage.getDigit8().click();
        additionPage.getDigitEqual().click();
        WebElement result = additionPage.getResult();
        System.out.println("Result is : " + result.getText());
    }
}
