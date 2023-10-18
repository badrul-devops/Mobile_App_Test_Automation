package pages.AdditionPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingApp {

    public AppiumDriver driver;
//    public TestingApp testingApp;

    By allow_window = By.id("com.android.permissioncontroller:id/grant_dialog");

    By allow_button = By.id("com.android.permissioncontroller:id/permission_allow_button");

    By homepage = By.xpath("//android.widget.LinearLayout[@content-desc=\"Songs\"]");

    By song = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/a1.b/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/c2.b/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");

    By close_bg_play = By.id("musicplayer.musicapps.music.mp3player:id/img_close");

    By bar = By.id("musicplayer.musicapps.music.mp3player:id/visualizer");

    By songPage = By.id("musicplayer.musicapps.music.mp3player:id/detailView");

    public TestingApp(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement allow_window() {
        return driver.findElement(allow_window);
    }


    public WebElement allow_button() {

        return driver.findElement(allow_button);


    }

    public WebElement homepage() {
        return driver.findElement(homepage);

    }
    public WebElement song() {
        return driver.findElement(song);

    }
    public WebElement bar() {
        return driver.findElement(bar);

    }
    public WebElement Songpage() {
        return driver.findElement(songPage);

    }
    public WebElement closr_bg_play() {
        return driver.findElement(close_bg_play);

    }

}
