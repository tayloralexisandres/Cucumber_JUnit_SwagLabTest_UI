package com.cydeo.step_definitions;

import com.cydeo.pages.CRMpage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class US07step_definitions {
CRMpage crMpage=new CRMpage();




    @Then("user sees {int} modules")
    public void userSeesModules(int expectedarg0) {

List<WebElement>fifteenModules=crMpage.mainmenu;
BrowserUtils.sleep(1);
Assert.assertEquals(fifteenModules.size(),expectedarg0);








    }

    @Then("user should have access to modules")
    public void userShouldHaveAccessToModules() {

        int count=0;
        List<WebElement> fifteen=crMpage.mainmenu;
        for (WebElement element : fifteen) {
                count++;
            System.out.println(count);
                BrowserUtils.sleep(2);
            Assert.assertTrue(element.isEnabled());
            BrowserUtils.sleep(2);
            System.out.println(element.getText());
        }

    }






    @Given("user is on the ERP app login page")
    public void user_is_on_the_erp_app_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        crMpage.submit.click();
    }






    @When("user for events enters below correct credentials")
    public void userForEventsEntersBelowCorrectCredentials(Map<String,String>credentials) {
        crMpage.userName.sendKeys(credentials.get("username"));
        crMpage.password.sendKeys(credentials.get("password"));
    }


    @Then("user should see their name on dashboard")
    public void userShouldSeeTheirNameOnDashboard() {
        String expected=crMpage.verifyName.getText();


        Assert.assertTrue(crMpage.verifyName.isDisplayed());
        Assert.assertTrue(expected.contains(crMpage.verifyName.getText()));
        System.out.println(expected+" - " +crMpage.verifyName.getText());
    }
  /*  @Given("user is on the ERP app login page")
    public void user_is_on_the_erp_app_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user for events enters below correct credentials")
    public void user_for_events_enters_below_correct_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see their name on dashboard")
    public void user_should_see_their_name_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user sees {int} modules")
    public void user_sees_modules(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should have access to modules")
    public void user_should_have_access_to_modules() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    */
}

