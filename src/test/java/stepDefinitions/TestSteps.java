package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;


public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup){
       this.setup = setup;
       this.testingApp = setup.pageObjectManager.getAdditionPage();
    }


    @Given("Check that a permission Window is display")
    public void checkThatAPermissionWindowIsDisplay() throws InterruptedException {
        Assert.assertTrue(testingApp.allow_window().isDisplayed());
        Thread.sleep(1000);


    }

    @When("Click on Allow button")
    public void clickOnAllowButton() throws InterruptedException {
        testingApp.allow_button().click();
        Thread.sleep(1000);
    }

    @Then("Check that home page is displayed")
    public void checkThatHomePageIsDisplayed() throws InterruptedException {
        Assert.assertTrue(testingApp.homepage().isDisplayed());
        Thread.sleep(1000);
    }

    @Given("Go to music player")
    public void goToMusicPlayer() throws InterruptedException {
        testingApp.allow_button().click();
        Thread.sleep(1000);

    }

    @Then("Check all list is displayed")
    public void checkAllListIsDisplayed() throws InterruptedException {
        Assert.assertTrue(testingApp.homepage().isDisplayed());
        Thread.sleep(1000);

    }

    @When("click on {int}st song")
    public void clickOnStSong(int arg0) throws InterruptedException {
        testingApp.song().click();
        Thread.sleep(1000);

    }

    @Then("Check song start")
    public void checkSongStart() throws InterruptedException {
        testingApp.closr_bg_play().click();
        Thread.sleep(1000);

        Assert.assertTrue(testingApp.bar().isDisplayed());

    }

    @And("Check a small bar chart is displayed")
    public void checkASmallBarChartIsDisplayed() {
        Assert.assertTrue(testingApp.bar().isDisplayed());

    }

    @When("Click again on the song name")
    public void clickAgainOnTheSongName() throws InterruptedException {
        testingApp.song().click();
        Thread.sleep(1000);
    }

    @Then("Check the song page is display")
    public void checkTheSongPageIsDisplay() throws InterruptedException {
        Assert.assertTrue(testingApp.Songpage().isDisplayed());
    }
}
