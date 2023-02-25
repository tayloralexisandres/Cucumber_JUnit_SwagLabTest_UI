package com.cydeo.step_definitions;

import com.cydeo.pages.BingPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class bing_step_definitions {
BingPage bingPage=new BingPage();
    @Given("User is on the bing home page")
    public void user_is_on_the_bing_home_page() {
        Driver.getDriver().get("https://bing.com");
        BrowserUtils.sleep(1);
    }
    @When("User enters orange in Bing search box")
    public void user_enters_orange_in_bing_search_box() {
        bingPage.bingsearchBox.sendKeys("orange"+ Keys.ENTER);
        BrowserUtils.sleep(1);

    }
    @Then("User should see orange is in the title")
    public void user_should_see_orange_is_in_the_title() {
        BrowserUtils.verifyTitleContains("orange");
        BrowserUtils.sleep(1);

    }

    @When("User enters {string} in Bing search box")
    public void userEntersInBingSearchBox(String arg0) {
        bingPage.bingsearchBox.sendKeys(arg0+Keys.ENTER);

    }

    @Then("User should see {string} is in the title")
    public void userShouldSeeIsInTheTitle(String arg0) {

       BrowserUtils.verifyTitleContains(arg0);



    }


}
