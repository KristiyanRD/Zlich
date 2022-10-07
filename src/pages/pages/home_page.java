package pages;

import Common.BasePage;
import io.appium.java_client.AppiumDriver;
import pages_selectors.home_page_selectors;

import java.time.Duration;

public class home_page extends BasePage {

    public home_page(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public void click_login_view() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        clickOnElement(home_page_selectors.SAVE_PASSWORD_NOT_NOW());
    }
    public boolean is_women_view(){
        return is_element_displayed("Login logo", home_page_selectors.WOMEN_VIEW());
    }
    public boolean is_men_view(){
        return is_element_displayed("Forgot password button", home_page_selectors.MEN_VIEW());
    }
    public boolean is_kids_view(){
        return is_element_displayed("Apple button", home_page_selectors.KIDS_VIEW());
    }
    public boolean is_cookie_popup(){
        return is_element_displayed("Facebook button", home_page_selectors.COOKIE_POPUP());
    }
}
