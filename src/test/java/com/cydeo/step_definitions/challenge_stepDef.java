package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class challenge_stepDef  {





    @When("User sends a post request to create")
    public void user_sends_a_post_request_to_create() {
        basePath= ConfigReader.getProperty("apiUser");

              // basePathAccount/v1/User
    }
    @When("user captures staus code, userId, usesrname and books information")
    public void user_captures_staus_code_user_id_usesrname_and_books_information() {

    }
    @Then("verify status code and verify username and userId is not null")
    public void verify_status_code_and_verify_username_and_user_id_is_not_null() {

    }

}
