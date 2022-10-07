package pages_selectors;
import Common.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class login_page_selectors extends BasePage {
    public login_page_selectors(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public static MobileElement LOGIN_LOGO(){
        return (MobileElement) driver.findElementByXPath("(//android.view.View[@content-desc=\"Log in\"])[1]");
    }
    public static MobileElement LOGIN_VIEW(){
        return (MobileElement) driver.findElementByXPath("(//android.view.View[@content-desc=\"Log in\"])[2]");
    }
    public static MobileElement NEW_CUSTOMER_VIEW(){
        return (MobileElement)driver.findElementByAccessibilityId("New customer");
    }
    // LOGIN VIEW SELECTORS
    public static MobileElement EMAIL_FILED(){
        return (MobileElement)driver.findElementByXPath("//android.widget.EditText[1]");
    }
    public static MobileElement PASSWORD_FILED(){
        return (MobileElement)driver.findElementByXPath("//android.view.View[@content-desc=\"OR\n" +
                "Log in with your email address\"]/android.widget.EditText[2]");
    }
    public static MobileElement LOGIN_BUTTON(){
        return (MobileElement)driver.findElementByXPath("//android.widget.Button[@content-desc=\"Log in\"]");
    }
    public static MobileElement FORGOT_PASSWORD_BUTTON(){
        return (MobileElement)driver.findElementByAccessibilityId("Forgot password?");
    }
    public static MobileElement SING_IN_WITH_APPLE_BUTTON(){
            return (MobileElement)driver.findElementByAccessibilityId("Sign in with Apple");
    }
    public static MobileElement SING_IN_WITH_FACEBOOK_BUTTON(){
            return (MobileElement)driver.findElementByAccessibilityId("Forgot password?");
    }
    // REGISTRATION VIEW SELECTORS
    public static MobileElement REGISTER_NOW_BUTTON(){
            return (MobileElement)driver.findElementByAccessibilityId("Register now");
    // REGISTRATION ERROR MESSAGES
    }
    public static MobileElement EMAIL_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("Please enter your email address");
    }
    public static MobileElement INVALID_EMAIL_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("This is an invalid email address");
    }
    public static MobileElement EMAIL_OR_PASSWORD_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("OR\n" +
                    "Log in with your email address\n" +
                    "Your email address or password is incorrect. Please try again.");
    }
    public static MobileElement FIRST_NAME_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("Please enter your first name");
    }
    public static MobileElement LAST_NAME_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("Please enter your last name");
    }
    public static MobileElement PASSWORD_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("Please set a password");
    }
    public static MobileElement INVALID_PASSWORD_ERROR_MSG(){
            return (MobileElement)driver.findElementByAccessibilityId("Please set a password");
    }






}
