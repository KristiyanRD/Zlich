package tests;

import Common.DriverInit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.entry_page;
import pages.login_page;

import java.net.MalformedURLException;

import static Common.BasePage.scrollToElement;

public class test_unsuccessful_registration extends DriverInit {

    entry_page entry_page;
    login_page login_page;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseSetUp();
    }

    @Test
    public void test_01_verify_registration_error_msg() throws InterruptedException {
        entry_page = new entry_page(driver);
        entry_page.close_country_selection();
        entry_page.select_men();

        login_page = new login_page(driver);

        login_page.click_new_customer_view();
        scrollToElement("Register now");
        login_page.click_register_button();

        AssertJUnit.assertTrue(login_page.is_email_error_msg_displayed());
        AssertJUnit.assertTrue(login_page.is_first_name_error_msg_displayed());
        AssertJUnit.assertTrue(login_page.is_last_name_error_msg_displayed());
        AssertJUnit.assertTrue(login_page.is_password_error_msg_displayed());



    }
    @AfterTest
    public void tear_down () {
        tearDown();
    }

}