package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Etsy_step_definitions {
EtsyPage etsyPage=new EtsyPage();
    @Given("user is on etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("etsy"));

    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        BrowserUtils.verifyTitleContains("Etsy");
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.txt_searchbox.sendKeys("Wooden Spoon");
        BrowserUtils.sleep(1);

    }
    @When("user click to Etsy search button")
    public void user_click_to_etsy_search_button() {

        etsyPage.btn_search.click();
    }
        @Then("user sees Wooden Spoon in the title")
        public void user_sees_wooden_spoon_in_the_title () {

        BrowserUtils.verifyTitleContains("Wooden");

        }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String arg0) {
        etsyPage.txt_searchbox.sendKeys(arg0);
        BrowserUtils.sleep(1);
        etsyPage.btn_search.click();
    }

    @Then("user sees {string} in the title")
    public void userSeesInTheTitle(String arg0) {
        BrowserUtils.verifyTitleContains(arg0);
    }
}


