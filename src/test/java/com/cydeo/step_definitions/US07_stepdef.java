package com.cydeo.step_definitions;

import com.cydeo.pages.CrmPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class US07_stepdef {

CrmPage crmPage=new CrmPage();



    @Given("user is on the ERP app login page")
    public void user_is_on_the_erp_app_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("user for events enters below correct credentials")
    public void user_for_events_enters_below_correct_credentials(Map<String,String>credentials) {
        crmPage.userName.sendKeys(credentials.get("username"));
        crmPage.password.sendKeys(credentials.get("password"));

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        crmPage.submit.click();
    }
    @Then("user should see their name on dashboard")
    public void user_should_see_their_name_on_dashboard() {
      String actual=  crmPage.verifyName.getText();
      String expected="Events";
        Assert.assertTrue(actual.contains(expected));
        Assert.assertTrue(crmPage.verifyName.isDisplayed());

    }
    @Then("user sees {int} modules")
    public void user_sees_modules(int expected15) {
        List<WebElement> fifteen=crmPage.mainmenu;
        Assert.assertEquals(expected15,fifteen.size());

    }
    @Then("user should have access to modules")
    public void user_should_have_access_to_modules() {
        List<WebElement> fifteen=crmPage.mainmenu;
        for (WebElement each : fifteen) {
            Assert.assertTrue(each.isDisplayed());

        }
    }

}
