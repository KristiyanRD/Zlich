package pages;

import Common.BasePage;
import io.appium.java_client.AppiumDriver;
import pages_selectors.login_page_selectors;

public class login_page extends BasePage {

    public login_page(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void click_login_view() {
        clickOnElement(login_page_selectors.LOGIN_VIEW());
    }
    public void click_new_customer_view() {
        clickOnElement(login_page_selectors.NEW_CUSTOMER_VIEW());
    }
    public void click_login_button() {
        clickOnElement(login_page_selectors.LOGIN_BUTTON());
    }
    public void click_register_button() {
        clickOnElement(login_page_selectors.REGISTER_NOW_BUTTON());
    }
    public void enter_email(String enter_email) {
        clickOnElement(login_page_selectors.EMAIL_FILED());
        sendKeys(login_page_selectors.EMAIL_FILED(), enter_email);
    }
    public void enter_password(String enter_password) {
        clickOnElement(login_page_selectors.PASSWORD_FILED());
        sendKeys(login_page_selectors.PASSWORD_FILED(), enter_password);
    }
    public boolean is_login_logo_displayed(){
        return is_element_displayed("Login logo", login_page_selectors.LOGIN_LOGO());
    }
    public boolean is_forgot_password_button_displayed(){
        return is_element_displayed("Forgot password button", login_page_selectors.FORGOT_PASSWORD_BUTTON());
    }
    public boolean is_apple_button_displayed(){
        return is_element_displayed("Apple button", login_page_selectors.SING_IN_WITH_APPLE_BUTTON());
    }
    public boolean is_facebook_button_displayed(){
        return is_element_displayed("Facebook button", login_page_selectors.SING_IN_WITH_FACEBOOK_BUTTON());
    }
    public boolean is_email_error_msg_displayed(){
        return is_element_displayed("Email error message", login_page_selectors.EMAIL_ERROR_MSG());
    }
    public boolean is_invalid_email_error_msg_displayed(){
        return is_element_displayed("Email error message", login_page_selectors.INVALID_EMAIL_ERROR_MSG());
    }
    public boolean is_email_or_password_error_msg_displayed(){
        return is_element_displayed("Email or password error message", login_page_selectors.EMAIL_OR_PASSWORD_ERROR_MSG());
    }
    public boolean is_first_name_error_msg_displayed(){
        return is_element_displayed("First name error message", login_page_selectors.FIRST_NAME_ERROR_MSG());
    }
    public boolean is_last_name_error_msg_displayed(){
        return is_element_displayed("Last name error message", login_page_selectors.LAST_NAME_ERROR_MSG());
    }
    public boolean is_password_error_msg_displayed(){
        return is_element_displayed("Password error message", login_page_selectors.PASSWORD_ERROR_MSG());
    }

    public void login(String enter_email, String enter_password) {
        enter_email(enter_email);
        enter_password(enter_password);
        click_login_button();
    }
}
