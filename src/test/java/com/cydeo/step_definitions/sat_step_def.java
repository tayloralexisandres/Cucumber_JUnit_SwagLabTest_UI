package com.cydeo.step_definitions;

import com.cydeo.pages.ButtonBasePAge;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class sat_step_def {
    ButtonBasePAge button=new ButtonBasePAge();

    @Given("user is on the webpage")
    public void user_is_on_the_webpage() {
        Driver.getDriver().get("https://ultimateqa.com/complicated-page");

    }
    @Given("user sees {int} buttons")
    public void user_sees_buttons(int expected12) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(expected12,button.buttonsAre12.size());


    }
    @Then("user sees header text is {string}")

    public void user_sees_header_text_is(String expectedtext) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedtext,button.header.getText());


    }
}
