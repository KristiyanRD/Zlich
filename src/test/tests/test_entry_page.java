package tests;
import java.net.MalformedURLException;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import Common.DriverInit;
import pages.entry_page;

public class test_entry_page extends DriverInit {

    entry_page entry_page;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseSetUp();
    }

    @Test
    public void checkHomePage() throws InterruptedException {
        try {
            entry_page = new entry_page(driver);
            entry_page.close_country_selection();

            AssertJUnit.assertTrue(entry_page.is_women_button_displayed());
            AssertJUnit.assertTrue(entry_page.is_men_button_displayed());
            AssertJUnit.assertTrue(entry_page.is_global_button_displayed());
            AssertJUnit.assertTrue(entry_page.is_go_to_shop_button_displayed());

        }catch (Exception exc){
            System.err.println("Exception: " + exc.getClass());
        }

    }

    @AfterTest
    public void tear_down () {
        tearDown();
    }

}