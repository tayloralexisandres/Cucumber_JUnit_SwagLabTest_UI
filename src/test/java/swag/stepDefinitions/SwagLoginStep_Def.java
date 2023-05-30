package swag.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.pages.SwagHomePage;
import swag.pages.SwagLoginPage;
import swag.utilities.Driver;

import java.time.Duration;

public class SwagLoginStep_Def {
    SwagLoginPage page=new SwagLoginPage();
    SwagHomePage home=new SwagHomePage();
    String actualTitle;
    @Given(":User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://www.saucedemo.com/");
    }
    @When("User enters valid username {string}")
    public void user_enters_valid_username(String valid) {

        page.userLogin(valid);

    }
    @When("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
        page.password.sendKeys(password);

    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        page.loginButton.click();
    }
    @Then("User should see {string} displayed on Products page")
    public void user_should_see_displayed_on_products_page(String products) {
         actualTitle=home.productsTitle.getText();
         Assert.assertEquals(products,actualTitle);

    }


    @When("User enters locked out username {string}")
    public void userEntersLockedOutUsername(String user) {
      page.userLogin(user);
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String message) {
        page.errorMessage(message);
    }

    @When("User enters problem username {string}")
    public void userEntersProblemUsername(String user) {

        page.userLogin(user);
    }

    @Then("User should not be able to add Sauce Labs Fleece Jacket")
    public void userShouldNotBeAbleToAddSauceLabsFleeceJacket() {
        boolean isDisabled=!home.fleeceAdd.isEnabled();
        Assert.assertEquals(false,isDisabled);
    }

    @When("User enters username {string}")
    public void userEntersUsername(String user) {
      page.username.sendKeys(user);
    }

    @Then("User should wait for five seconds to launch to Product page")
    public void userShouldWaitForFiveSecondsToLaunchToProductPage() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(home.productsTitle));
        Assert.assertEquals("Products",home.productsTitle.getText());
    }

    @When("User enters invalid username {string}")
    public void userEntersInvalidUsername(String invalid) {
        page.username.sendKeys(invalid);
    }

    @And("User enters invalid password {string}")
    public void userEntersInvalidPassword(String invpass) {
        page.password.sendKeys(invpass);
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
       Assert.assertTrue( page.error.isDisplayed());
    }

    @When("User enters a blank username")
    public void userEntersABlankUsername() {
        page.username.sendKeys("");
    }

    @And("User enters a blank password")
    public void userEntersABlankPassword() {
        page.password.sendKeys("");
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String message) {
        page.errorMessage(message);
    }

    @Then("{string} message should be displaye")
    public void messageShouldBeDisplaye(String message) {
        page.errorMessage(message);
    }

    @Then("User should see {string} displayed on Products page and log out")
    public void userShouldSeeDisplayedOnProductsPageAndLogOut(String product) {
       actualTitle= home.productsTitle.getText();
       Assert.assertEquals("Products",actualTitle);
       home.logout();
    }
}
