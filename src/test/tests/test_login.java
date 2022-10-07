package tests;
import Common.DriverInit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.entry_page;
import pages.login_page;
import pages.home_page;

import java.net.MalformedURLException;

public class test_login extends DriverInit {

    entry_page entry_page;
    login_page login_page;
    home_page home_page;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseSetUp();
    }

    @Test
    public void test_01_verify_login_page_elements() throws InterruptedException {
        entry_page = new entry_page(driver);

        entry_page.close_country_selection();
        entry_page.select_men();

        login_page = new login_page(driver);

        login_page.click_login_view();
        AssertJUnit.assertTrue(login_page.is_login_logo_displayed());
        AssertJUnit.assertTrue(login_page.is_forgot_password_button_displayed());
        AssertJUnit.assertTrue(login_page.is_apple_button_displayed());
        AssertJUnit.assertTrue(login_page.is_facebook_button_displayed());


    }
    @Test
    public void test_02_login_with_wrong_email(){
        login_page.login("test", "iS7alker");
        AssertJUnit.assertTrue(login_page.is_invalid_email_error_msg_displayed());

    }
    @Test
    public void test_03_login_with_wrong_password(){
        login_page.login("krischo_kn@abv.bg", "123");
        AssertJUnit.assertTrue(login_page.is_email_or_password_error_msg_displayed());

    }
    @Test
    public void test_04_login() throws InterruptedException {
        login_page.login("krischo_kn@abv.bg", "iS7alker");

        home_page = new home_page(driver);
        home_page.click_login_view();

        AssertJUnit.assertTrue(home_page.is_women_view());
        AssertJUnit.assertTrue(home_page.is_men_view());
        AssertJUnit.assertTrue(home_page.is_kids_view());
        AssertJUnit.assertTrue(home_page.is_cookie_popup());

    }

    @AfterTest
    public void tear_down () {
        tearDown();
    }

}