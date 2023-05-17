package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;

import io.cucumber.java.*;
import io.restassured.RestAssured;
import org.apiguardian.api.API;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import java.sql.DriverManager;

public class Hooks {



    @Before("@api")
    public  void init(){

        RestAssured.baseURI="https://demoqa.com";

    }

    @Before("@ui")
    public void setupMethod1() {
       Driver.getDriver().get(ConfigReader.getProperty("espn"));

    }




    @After("@ui")
    public void tearDownMethod(Scenario scenario) {

        if(scenario.isFailed()){

        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }

    @After("@ui")
    public void tearDown(){

        Driver.closeDriver();

    }







}
