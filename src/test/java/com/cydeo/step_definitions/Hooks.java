package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.DriverManager;

public class Hooks {


    @Before
    public void setupMethod1() {
      // Driver.getDriver().get(ConfigReader.getProperty("env"));

    }




    @After
    public void tearDownMethod(Scenario scenario) {

        if(scenario.isFailed()){

        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }

    @After
    public void tearDown(){

        Driver.closeDriver();

    }







}
