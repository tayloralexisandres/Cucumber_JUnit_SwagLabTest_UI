package com.cydeo.step_definitions;

import com.cydeo.pages.CRMpage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class US02step_definitions extends CRMpage {
    CRMpage crMpage=new CRMpage();
    @Then("user clicks to repairs")
    public void user_clicks_to_repairs() {
        crMpage.mainmenu.get(10).click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(crMpage.repairOrders.isDisplayed());

    }





    @Then("user sees {int} columns displayed in repairs")
    public void userSeesSixColumnsDisplayedInRepairs(int expected) {
        List<WebElement> repairsActual=crMpage.repaircolumns;

        int total=0;

        for (WebElement each : repairsActual) {
            if (!(each.getText().equals("o_checkbox"))) {
               total++;
            }

            System.out.println(each.getText());
        }

        Assert.assertEquals(expected,total);

            BrowserUtils.sleep(1);

        }
    }

