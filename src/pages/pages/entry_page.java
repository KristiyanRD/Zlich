package pages;

import io.appium.java_client.AppiumDriver;
import pages_selectors.entry_page_selectors;
import Common.BasePage;
public class entry_page extends BasePage {

    public entry_page(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void close_country_selection() throws InterruptedException {
        Thread.sleep(4000);
        clickOnElement(entry_page_selectors.CLOSE_COUNTRY_SELECTION());
    }
    public void select_men(){
        clickOnElement(entry_page_selectors.MEN_SECTION());
    }
    public boolean is_women_button_displayed(){
        return is_element_displayed("Women button", entry_page_selectors.WOMEN_SECTION());
    }
    public boolean is_men_button_displayed(){
        return is_element_displayed("Men button", entry_page_selectors.MEN_SECTION());
    }
    public boolean is_global_button_displayed(){
        return is_element_displayed("Global button",entry_page_selectors.SELECTION_GLOBAL());
    }
    public boolean is_go_to_shop_button_displayed(){
        return is_element_displayed("Go to shop button", entry_page_selectors.GO_TO_SHOP());
    }
}
