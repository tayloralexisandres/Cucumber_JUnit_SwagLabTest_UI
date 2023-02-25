package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class Data_tables_step_definitions {

    @Then("User should see below list")
    public void user_should_see_below_list(List<String>fruitsAndVeggies) {
        System.out.println(fruitsAndVeggies);
        System.out.println(fruitsAndVeggies.get(1));

    }

    @Then("User should see list below")
    public void userShouldSeeListBelow(List<String>pets) {
        for (String each : pets) {
            System.out.println(each);

        }
    }

    @Then("Officer is able to see any data he wants")
    public void officerIsAbleToSeeAnyDataHeWants(Map<String,String>driverinfo) {
        System.out.println("driverinfo = " + driverinfo);
        System.out.println(driverinfo.size());


    }
}
