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
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//li[@class='sports menu-nfl']"))).perform();
        Thread.sleep(3000);
    }

    @When("user navigates to standings")
    public void user_naviagtes_to_standings() throws InterruptedException {
        WebElement standings = Driver.getDriver().findElement(By.xpath("//div[@id='submenu-sportsmenunfl']//ul//li[5]"));
        standings.click();

        Thread.sleep(3000);

        WebElement league = Driver.getDriver().findElement(By.xpath("//a[@href='/nfl/standings/_/group/league']"));
        league.click();

        Thread.sleep(3000);
    }

    @Then("user should see all teams in alphabetical order")
    public void user_should_see_all_teams_in_alphabetical_order() {
        List<WebElement> standings = Driver.getDriver().findElements(By.xpath("//div[@class='team-link flex items-center clr-gray-03']"));
        System.out.println(standings.size());
        List<String> teams = new ArrayList<>();
        for (WebElement each : standings) {
            teams.add(each.getText());
        }

        Collections.sort(teams, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare the strings while considering letters as greater than words
                if (Character.isLetter(s1.charAt(0)) && !Character.isLetter(s2.charAt(0))) {
                    return 1; // s1 is a letter, s2 is a word, s1 comes after s2
                } else if (!Character.isLetter(s1.charAt(0)) && Character.isLetter(s2.charAt(0))) {
                    return -1; // s1 is a word, s2 is a letter, s1 comes before s2
                } else {
                    return s1.compareTo(s2); // Compare normally if both are either letters or words
                }
            }
        });

// Print the sorted teams
        for (String team : teams) {
            System.out.println(team);
        }
    }
}







