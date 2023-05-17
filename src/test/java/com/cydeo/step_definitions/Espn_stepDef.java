package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.*;

public class Espn_stepDef {




    @Given("user is on the website")
    public void user_is_on_the_website() {

    }
    @When("user hoovers over NFL")
    public void user_hoovers_over_nfl() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//li[@class='sports menu-nfl']"))).perform();
        Thread.sleep(3000);
    }
    @When("user navigates to standings")
    public void user_naviagtes_to_standings() throws InterruptedException {
        WebElement standings=Driver.getDriver().findElement(By.xpath("//div[@id='submenu-sportsmenunfl']//ul//li[5]"));
        standings.click();

        Thread.sleep(3000);

        WebElement league=Driver.getDriver().findElement(By.xpath("//a[@href='/nfl/standings/_/group/league']"));
                league.click();

                Thread.sleep(3000);
    }
    @Then("user should see all teams in alphabetical order")
    public void user_should_see_all_teams_in_alphabetical_order() {


        List<WebElement> standings=  Driver.getDriver().findElements(By.xpath("//td[@class='team ']//span/following-sibling::a[2]"));

        System.out.println(standings.size());
        List<String> teams=new ArrayList<>();
        for (WebElement each : standings) {
           teams.add(each.getText());
           System.out.println(teams);

        }


    }

    }



