package Common;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends DriverInit {
    public static AppiumDriver driver;
    public static final long WAIT = 20;

    public BasePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
//        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean is_element_displayed(String text, MobileElement element) {
        try {
            waitForVisibility(element);
            System.out.println("> " + text + "is displayed!");
            return true;
        } catch (Exception e) {
            System.out.println("# " + text + "is not displayed!\n" + e);
            return false;
        }
    }

    public void clickOnElement(MobileElement element) {
        waitForVisibility(element);
        element.click();
    }

    public void sendKeys(MobileElement element, String enter_text) {
        waitForVisibility(element);
        element.click();
        element.clear();
        element.sendKeys(enter_text);
        driver.hideKeyboard();
    }

    public String getAttribute(MobileElement element, String attribute) {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

    public static MobileElement scrollToElement(String element_name) {
        try {
             driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                            ".scrollIntoView(new UiSelector().textContains(\"" + element_name + "\"))"));
        } catch (Exception ignored) {

        }
        return null;
    }
}




