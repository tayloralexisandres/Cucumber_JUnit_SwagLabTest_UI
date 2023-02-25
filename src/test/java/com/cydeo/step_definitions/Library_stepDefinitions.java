package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Library_stepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("User is at login page");
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("Librarian inputs username");
       // Driver.getDriver().findElement(By.cssSelector("#inputEmail")).sendKeys("librarian10@library"+ Keys.ENTER);


    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("Librarian inputs password");
       // Driver.getDriver().findElement(By.cssSelector("#inputPassword")).sendKeys("Dltvxmpn"+Keys.ENTER);

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User is logged in and sees dashboard");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("Student enters username");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("Student enters password");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("Admin enters passwords");

    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("Admin enters username");
    }

}
