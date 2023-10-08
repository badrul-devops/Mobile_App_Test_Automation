package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Base {
    public  AppiumDriver driver;


    public AppiumDriver AppiumDriverManager() throws Exception{

//        startAppiumService(portNumber);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel XL");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceVersion", "14");
        cap.setCapability("platformName", "Android");

        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);
        Thread.sleep(5000);
        System.out.println("Application is started...");

        return driver;

    }

    public void startAppiumService(String portNumber){
        AppiumDriverLocalService service;
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(Integer.parseInt(portNumber));
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Service has been started with port number: "+portNumber);
    }

}
