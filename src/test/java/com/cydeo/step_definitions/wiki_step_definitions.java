package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.pages.WikiResultPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wiki_step_definitions {

WikiPage wikiPage=new WikiPage();
WikiResultPage wikiResultPage=new WikiResultPage();

    @Given("User is on the Wikipedia page")
    public void user_is_on_the_wikipedia_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User enters {string} in the search box")
    public void userEntersInTheSearchBox(String arg0) {
        wikiPage.searchbox.sendKeys(arg0+Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {
        BrowserUtils.sleep(1);
     BrowserUtils.verifyTitleContains(arg0);

    }

    @Then("User should see {string} in the header")
    public void userShouldSeeInTheHeader(String arg0) {
        String actualHeaderText= wikiResultPage.header.getText();
        BrowserUtils.sleep(1);
        Assert.assertEquals(actualHeaderText,arg0);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String arg0) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(wikiResultPage.imageheader.getText(),arg0);
    }
}
