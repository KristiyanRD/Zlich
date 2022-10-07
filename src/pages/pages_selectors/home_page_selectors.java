package pages_selectors;
import Common.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class home_page_selectors extends BasePage {
    public home_page_selectors(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public static MobileElement SAVE_PASSWORD_NOT_NOW() {
        return (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
    }
    public static MobileElement MEN_VIEW() {
        return (MobileElement) driver.findElementByAccessibilityId("Men");
    }
    public static MobileElement WOMEN_VIEW() {
        return (MobileElement) driver.findElementByAccessibilityId("Women");
    }
    public static MobileElement KIDS_VIEW() {
        return (MobileElement) driver.findElementByAccessibilityId("Kids");
    }
    public static MobileElement COOKIE_POPUP () {
        return (MobileElement) driver.findElementByAccessibilityId("IT'S ABOUT YOU - Your personalized shop");
    }
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




