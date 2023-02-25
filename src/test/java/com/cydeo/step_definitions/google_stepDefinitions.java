package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class google_stepDefinitions  {

    GooglePage googlePage=new GooglePage();


    @When("User is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env1"));
    }
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(expectedTitle,actualTitle);
        Driver.closeDriver();
    }


    @When("User enters {word} in search box")
    public void userEntersAppleInSearchBox(String word) {

        googlePage.searchbox.sendKeys(word+ Keys.ENTER);

    }

    @Then("User should see title is {word} – Google Search")
    public void userShouldSeeTitleIsAppleGoogleSearch(String word) {
        //Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));

        BrowserUtils.verifyTitleContains(word);
    }


    @Then("User should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> keywords) {
        for (String eachkey : keywords) {
            googlePage.searchbox.clear();
            googlePage.searchbox.sendKeys(eachkey+Keys.ENTER);

        }
    }


}
