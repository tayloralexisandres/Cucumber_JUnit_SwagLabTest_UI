package com.cydeo.step_definitions;

import com.cydeo.pages.CRMpage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class US01step_defintions {

    CRMpage crMpage = new CRMpage();

    @Then("user sees {int} coulmns and {int} checkbox")
    public void user_sees_coulmns_and_checkbox(int expectedText, int checkbox) {
        List<WebElement> sixcolums = crMpage.coulmns;
        int total = expectedText+checkbox;
        Assert.assertEquals(total,crMpage.coulmns.size());
        for (WebElement e : sixcolums) {
            System.out.println(e.getText());

            Assert.assertTrue(e.isDisplayed());
        }
    }














    @Then("user clicks to sales")
    public void user_clicks_to_sales() {
        crMpage.mainmenu.get(5).click();
        BrowserUtils.sleep(1);

    }

}
