package pages_selectors;
import Common.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class entry_page_selectors extends BasePage {
    public entry_page_selectors(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public static MobileElement CLOSE_COUNTRY_SELECTION(){
        return (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Select shop\"]/../android.view.View[1]");
    }
    public static MobileElement WOMEN_SECTION(){
        return (MobileElement) driver.findElementByAccessibilityId("Women");
    }
    public static MobileElement MEN_SECTION(){
        return (MobileElement)driver.findElementByAccessibilityId("Men");
    }
    public static MobileElement GO_TO_SHOP(){
        return (MobileElement)driver.findElement(MobileBy.AccessibilityId("Go to shop"));
    }
    public static MobileElement SELECTION_GLOBAL(){
        return (MobileElement)driver.findElement(MobileBy.AccessibilityId("Global"));
    }



//    public static MobileElement WOMEN_SECTION(){
//        return (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Women\"]");
//    }
//    public static MobileElement WOMEN_SECTION(){
//        return (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Women\"]");
//    }

//    public static MobileElement GO_TO_SHOP = (MobileElement)driver.findElement
//    (MobileBy.AccessibilityId("Go to shop"));
//    public static MobileElement SELECTION_GLOBAL = (MobileElement)driver.findElement
//    (MobileBy.AccessibilityId("Global"));



}
