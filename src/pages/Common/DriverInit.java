package Common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverInit {
    public static AppiumDriver<MobileElement> driver;
    public static void baseSetUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "RFCN309GPDK");
        capabilities.setCapability("app", "D:\\Qality Assurance\\Java-Maven-Projects\\Zlich-Appium_Project\\ZlichDemo\\application\\android\\ABOUT_YOU.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
